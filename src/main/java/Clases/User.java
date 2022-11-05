package Clases;
import Clases.Order;
import java.util.LinkedList;
import java.util.List;
public class User {

    //Atributos
    String userId;
    String userName;
    String userSurname;
    List <Order> processedOrders;

    // Constructor
    public User(){}
    public User(String s, String name, String surname) {
        this.userId = s;
        this.userName = name;
        this.userSurname = surname;
        this.processedOrders = new LinkedList<>();
    }

    // Constructores
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Order> getProcessedOrders() {
        return processedOrders;
    }

    public void setProcessedOrders(List<Order> processedOrders) {
        this.processedOrders = processedOrders;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
}
