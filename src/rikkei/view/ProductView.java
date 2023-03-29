package rikkei.view;

import rikkei.config.Config;
import rikkei.controller.ProductController;
import rikkei.model.Product;

import java.util.List;

public class ProductView {
    ProductController productController = new ProductController();
    List<Product> productList = productController.getListProduct();
    public void showListProduct(){
        System.out.println(productList);
        new Navbar();
    }
    public void createProduct() {
        while (true) {
            int id = 0;
            if (productList.size() == 0) {
                id = 1;
            } else {
                id = productList.get(productList.size() - 1).getId() + 1;
            }
            System.out.println("nhap ten: ");
            String name = Config.sc().nextLine();
            Product product = new Product(id, name);
            productController.createProduct(product);
            System.out.println("them thanh cong!");
            System.out.println("nhap bat ki de tiep tuc hoac nhap THOAT de tro ve menu");
            String backMenu = Config.sc().nextLine();
            if (backMenu.equalsIgnoreCase("thoat")) {
                new Navbar();
                break;
            }
        }
    }
        public void updateProduct(){
            while (true) {
                System.out.println("nhap id can sua : ");
                int id = Config.sc().nextInt();
                if(productController.detailProduct(id) == null){
                    System.err.println("id khong hop le");
                }else {
                    System.out.println("nhap ten");
                    String name = Config.sc().nextLine();
                    Product category = new Product(id,name);
                    productController.updateProduct(category);
                    System.out.println("sua thanh cong!");
                    System.out.println("nhap bat ki de tiep tuc hoac nhap THOAT de tro ve menu");
                    String backMenu = Config.sc().nextLine();
                    if(backMenu.equalsIgnoreCase("thoat")){
                        new Navbar();
                        break;
                    }
                }
            }
        }
        public void deleteProduct(){
            while (true){
                System.out.println("nhap id can sua :");
                int id = Config.sc().nextInt();
                if(productController.detailProduct(id) == null){
                    System.err.println("id khong hop le");
                }else {
                    Product product = new Product();
                    productController.deleteProduct(product);
                    System.out.println("xoa thanh cong!");
                    System.out.println("nhap bat ki de tiep tuc hoac nhap THOAT de tro ve menu");
                    String backMenu = Config.sc().nextLine();
                    if(backMenu.equalsIgnoreCase("thoat")){
                        new Navbar();
                        break;
                    }
                }
            }
    }
}
