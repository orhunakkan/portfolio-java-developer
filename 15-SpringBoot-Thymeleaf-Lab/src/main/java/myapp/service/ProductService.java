package myapp.service;

import myapp.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    boolean productCreate(Product product);

    List<Product> listProducts();

    Product findProductById(UUID uuid);

}
