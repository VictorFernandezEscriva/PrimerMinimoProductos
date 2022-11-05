package Clases;

import javax.validation.constraints.Null;
import java.util.*;
import java.util.Objects;

public class Product {

    //Atributos
    String productId;
    String description;
    double price;
    int numSales;

    //Constructor
    public Product(){}
    public Product(String productId, String description, double price) {
        this.productId = productId;
        this.description = description;
        this.price = price;
        this.numSales = 0;
    }


    // Getters y Setters

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumSales() {
        return numSales;
    }

    public void setNumSales(int numSales) {
        this.numSales = numSales;
    }
}