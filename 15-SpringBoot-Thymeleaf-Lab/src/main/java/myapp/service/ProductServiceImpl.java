package myapp.service;

import myapp.model.Product;
import myapp.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void productCreate(Product product) {
        product.setId(UUID.randomUUID());
        productRepository.save(product);
    }

    @Override
    public List<Product> listProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product findProductById(UUID uuid) {
        return productRepository.findProductById(uuid);
    }

}
