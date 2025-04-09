package pl.bszczuk.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.bszczuk.productcatalog.ArrayListProductStorage;
import pl.bszczuk.productcatalog.ProductCatalog;

@SpringBootApplication
public class App {
    public static void main (String[] args) {
        System.out.println("xd");
        SpringApplication.run(App.class, args);
    }

    @Bean
    ProductCatalog creatnewProductCatalog() {
        var catalog =  new ProductCatalog(
                new ArrayListProductStorage()
        );
        catalog.createProduct("hello","sdadsadsads");
        catalog.createProduct("hello","sdadsadsads2");
        catalog.createProduct("hello","sdadsadsads3");

        return catalog;
    }
}
