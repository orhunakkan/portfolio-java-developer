package myapp.repository;

import myapp.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductRepository {

    void save(Product product);
    Product findProductById(UUID productId);
    List<Product> findAll();

}
