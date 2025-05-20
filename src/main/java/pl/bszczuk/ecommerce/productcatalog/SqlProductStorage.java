package pl.bszczuk.ecommerce.productcatalog;

import java.util.List;

public class SqlProductStorage implements ProductStorage {
    @Override
    public List<Product> allProduct() {
        return List.of();
    }

    @Override
    public List<Product> allProducts() {
        return List.of();
    }

    @Override
    public void save(Product newProduct) {

    }

    @Override
    public Product loadProductById(String productId) {
        return null;
    }
}
