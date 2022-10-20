public class Product {

    //Atributos
    String productId;
    String productName;
    Double productPrice;

    public Product(String productId, String name, double price) {

        this.productId = productId;
        this.productName = name;
        this.productPrice = price;

    }

    public String getProductId() {
        return productId;
    }

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
    }

    public String getDescription() {
    }

    public int getNumSales() {
    }
}
