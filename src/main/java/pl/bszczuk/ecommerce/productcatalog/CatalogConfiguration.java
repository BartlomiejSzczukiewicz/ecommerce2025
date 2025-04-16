package pl.bszczuk.ecommerce.productcatalog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.bszczuk.productcatalog.ArrayListProductStorage;
import pl.bszczuk.productcatalog.ProductCatalog;

import java.math.BigDecimal;
@Configuration
public class CatalogConfiguration {

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
