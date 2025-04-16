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
        SpringApplication.run(App.class, args);
        //SpringApplication app = new SpringApplication(App.class);
        //app.setDefaultProperties(Collections.singletonMap("server.port", "8081")); application.yml config
        //app.run(args);
    }
}
