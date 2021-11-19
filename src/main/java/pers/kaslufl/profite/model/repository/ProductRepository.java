package pers.kaslufl.profite.model.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import pers.kaslufl.profite.model.entity.Product;

import java.util.List;

public class ProductRepository {
    private JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Product> getProducts() {
        return jdbcTemplate.query(
                "select p.* from product p",
                new ProductMapper()
        );
    }
}
