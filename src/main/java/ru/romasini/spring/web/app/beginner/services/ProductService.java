package ru.romasini.spring.web.app.beginner.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.romasini.spring.web.app.beginner.models.Product;
import ru.romasini.spring.web.app.beginner.repositories.ProductRepository;

import java.util.List;

@Component
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProductList(){
        return productRepository.getProductList();
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public void deleteById(long id) {
        productRepository.deleteById(id);
    }

    public long getNextId(){
        return productRepository.getNextId();
    }

}
