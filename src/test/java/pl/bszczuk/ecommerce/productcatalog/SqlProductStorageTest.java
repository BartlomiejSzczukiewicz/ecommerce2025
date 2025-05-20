package pl.bszczuk.ecommerce.productcatalog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import pl.bszczuk.ecommerce.productcatalog.*; //change

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SqlProductStorageTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    void helloWorldSql() {
        var sql = """
            select now();
    """;
        var result = jdbcTemplate.queryForObject(sql, String.class);
        assert result.contains("2025");
    }

    @Test
    void itSavesAndLoadProduct() {
        Product product = thereIsProduct();
        ProductStorage storage = thereIsStorage();

        storage.save(product);

        var loaded  = storage.loadProductById(product.getId());

        assertEquals(product.getId(), loaded.getId());
        assertEquals(product.getDescription(), loaded.getDescription());
    }


    private Product thereIsProduct() {
        return  new Product(UUID.randomUUID(),
                "sss",
                "ggg",
                new BigDecimal(99)
        );
    }

    private SqlProductStorage thereIsStorage() {
        return new SqlProductStorage();

    }

    @Test
    void itLoadsAllProducts() {
        Product product = thereIsProduct();
        ProductStorage storage = thereIsStorage();

        storage.save(product);

        List<Product> all = storage.allProducts();

        assertEquals(1,all.size());
    }
}
