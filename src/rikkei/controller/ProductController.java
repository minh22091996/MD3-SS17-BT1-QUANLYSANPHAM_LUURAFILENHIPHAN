package rikkei.controller;

import rikkei.model.Product;
import rikkei.service.IProductService;
import rikkei.service.ProductServiceIMPL;

import java.util.List;

public class ProductController {
    IProductService productService = new ProductServiceIMPL();
    public List<Product> getListProduct(){
        return productService.findAll();
    }
    public void createProduct(Product product){
        productService.save(product);
    }
    public Product detailProduct(int id){
        return productService.finById(id);
    }
    public void updateProduct(Product product){
       return ;
    }
    public void deleteProduct(Product product){

    }
}
