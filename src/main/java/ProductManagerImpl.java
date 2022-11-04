import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class ProductManagerImpl implements ProductManager{

    List<Product> products;
    HashMap<String,User> users;
    Queue<Order> orders;

    @Override
    public List<Product> productsByPrice() {



        return null;
    }

    @Override
    public List<Product> productsBySales() {



        return null;
    }

    @Override
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    @Override
    public Order processOrder() {
        return null;
    }

    @Override
    public List<Order> ordersByUser(String userId) {
        return null;
    }

    @Override
    public void addUser(String s, String name, String surname) {
        User a = new User(s, name, surname);
        this.users.put(s,a);
    }

    @Override
    public void addProduct(String productId, String name, double price) {
        Product p = new Product(productId, name, price);
    }

    @Override
    public Product getProduct(String productId) {
       // for(Product product : products){
       //     if( product.getProductId() == productId){

         //   }
        //}
        String aux;
        for (int i = 0; i < products.size(); i++){

            if(Objects.equals(products.get(i).getProductId(), productId)){
                return products.get(i);
            }
        }

        return null;
    }

    @Override
    public int numUsers() {
        return users.size();
    }

    @Override
    public int numProducts() {
        return products.size();
    }

    @Override
    public int numOrders() {
        return orders.size();
    }

    @Override
    public int numSales(String b001) {
        return 0;
    }
}
