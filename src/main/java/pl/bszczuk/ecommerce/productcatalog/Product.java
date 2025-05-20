package pl.bszczuk.ecommerce.productcatalog;

import java.math.BigDecimal;
import java.util.UUID;

public class Product {
    private final UUID uuid;
    private final String name;
    private final String description;
    private String url;
    private BigDecimal price; //czemu to ma byc bigDecimal?

    public Product(UUID uuid, String name, String description, BigDecimal price) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return uuid.toString();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return url;
    }

    public void setImage(String url) {
        this.url = url;
    } //pozniej

    public BigDecimal getPrice() {
        return price;
    }
}
