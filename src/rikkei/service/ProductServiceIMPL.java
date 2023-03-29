package rikkei.service;

import rikkei.config.Config;
import rikkei.model.Product;

import java.util.List;

public class ProductServiceIMPL implements IProductService{
List<Product> productList = new Config<Product>().readFile(Config.PATH_PRODUCT);


    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
if(finById(product.getId())==null){
    productList.add(product);
}else {
    productList.set(productList.indexOf(finById((product.getId()))),product);

}
new Config<Product>().writeFile(Config.PATH_PRODUCT,productList);

    }

    @Override
    public Product finById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId()==id){
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId()==id){
                productList.remove(i);
            }
        }
        new Config<Product>().writeFile(Config.PATH_PRODUCT,productList);
    }
}
