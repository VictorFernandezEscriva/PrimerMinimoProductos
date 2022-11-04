import javax.validation.constraints.Null;
import java.util.*;
import java.util.Objects;

public class Product {

    //Atributos
    String productId;
    String productName;
    Double productPrice;

    //Constructor
    public Product(String productId, String name, double price) {

        this.productId = productId;
        this.productName = name;
        this.productPrice = price;

    }

    // Getters y Setters
    public String getProductId() {return productId;}

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public double getPrice() {
        return 0;
    }

    public String getDescription() {
        return null;
    }

    public int getNumSales() {
        return 0;
    }
}
