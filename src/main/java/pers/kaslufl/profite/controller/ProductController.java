package pers.kaslufl.profite.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.kaslufl.profite.model.entity.Product;
import pers.kaslufl.profite.model.repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductRepository productRepository;

    public ProductController(JdbcTemplate jdbcTemplate) {
        this.productRepository = new ProductRepository(jdbcTemplate);
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping
    public List<Product> getProducts(){
        return productRepository.getProducts();
    }
}
