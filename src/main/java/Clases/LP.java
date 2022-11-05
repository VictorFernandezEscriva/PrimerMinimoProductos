package Clases;
public class LP {

    //Atributos
    String product;
    int quantity;

    // Constructor
    public LP(){} // Constructor vacío

    public LP(int quantity,String product) {
        this.quantity = quantity;
        this.product = product;
    }

    // Getters y Setters

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
