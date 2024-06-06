package myapp.service;

import myapp.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProduct(String name);
    void initialiseProductList();

}
