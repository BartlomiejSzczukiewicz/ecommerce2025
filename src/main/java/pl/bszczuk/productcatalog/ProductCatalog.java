package pl.bszczuk.productcatalog;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class ProductCatalog {

    ProductStorage productStorage;

    public ProductCatalog(ProductStorage productStorage) {
       this.productStorage = productStorage;
    }

    public List<Product> allProducts() {
        return productStorage.allProduct();
    }

    public String createProduct(String name, String description, BigDecimal price) {
        var uuid = UUID.randomUUID();

        var newProduct = new Product(
                uuid,
                name,
                description,
                price
        );
        this.productStorage.save(newProduct);
        return newProduct.getId();
    }

    public Product loadProductById(String productId) {
        return productStorage.loadProductById(productId);

    }

    public void changePrice(String productId, BigDecimal bigDecimal) {
        var product = productStorage.loadProductById(productId);

        if(BigDecimal.ZERO.compareTo(bigDecimal) <= 0) {
            throw new InvalidPriceException();
        }
    }

    public void changeImage(String productId, String url) {
        var product = loadProductById(productId);
        product.setImage(url);

    }
}
