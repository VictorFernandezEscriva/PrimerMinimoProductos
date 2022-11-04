
import java.util.List;

public interface ProductManager {

    //FUNCTIONS RELATED WITH PRODUCTS
    public List<Product> productsByPrice();
    public List<Product> productsBySales();
    public void addProduct(String productId, String name, double price);
    public Product getProduct(String productId);
    public int numProducts();

    // FUNCTIONS RELATED TO ORDERS
    public void addOrder(Order order);
    public Order processOrder();
    public List<Order> ordersByUser(String userId);
    public int numOrders();
    public int numSales(String b001);

    // FUNCTIONS RELATED TO USERS
    public void addUser(String s, String name, String surname);
    public int numUsers();









}
