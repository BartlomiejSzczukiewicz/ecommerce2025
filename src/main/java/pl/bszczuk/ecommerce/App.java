package pl.bszczuk.ecommerce;

import java.math.BigDecimal;
import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.bszczuk.productcatalog.ArrayListProductStorage;
import pl.bszczuk.productcatalog.ProductCatalog;

@SpringBootApplication
public class App {
    public static void main (String[] args) {
        //SpringApplication.run(App.class, args); stare
        SpringApplication app = new SpringApplication(App.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
        app.run(args);
    }

    @Bean
    ProductCatalog creatnewProductCatalog() {
        var catalog = new ProductCatalog(
                new ArrayListProductStorage()
        );
        catalog.createProduct("prod1","descriptionds",new BigDecimal(11));
        catalog.createProduct("hello","2222sdadsadsads2", new BigDecimal(21));
        catalog.createProduct("bue","131313sdadsadsads3", new BigDecimal(31));

        return catalog;
    }
}
