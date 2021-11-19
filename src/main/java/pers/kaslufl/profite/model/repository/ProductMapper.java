package pers.kaslufl.profite.model.repository;

import org.springframework.jdbc.core.RowMapper;
import pers.kaslufl.profite.model.entity.Installment;
import pers.kaslufl.profite.model.entity.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getInt("id"));
        product.setName(resultSet.getString("name"));
        product.setImage(resultSet.getString("image"));
        product.setOldPrice(resultSet.getFloat("oldPrice"));
        product.setPrice(resultSet.getFloat("price"));
        product.setDescription(resultSet.getString("description"));
        product.setInstallment(new Installment(resultSet.getInt("installments"), product.getPrice()));

        return product;
    }
}
