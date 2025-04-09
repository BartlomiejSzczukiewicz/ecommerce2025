package pl.bszczuk.ecommerce;
import pl.bszczuk.productcatalog.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductCatalogController {

    public ProductCatalogController(){
        ProductCatalog productCatalog;
    }
    @GetMapping("/api/version")
    public String version() {
        return "v0.0.1";
    }
    @GetMapping("/api/products")
    public List<Product> allProducts()  {
        return ;
    }
}
