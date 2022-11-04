import java.util.LinkedList;
import java.lang.String;
import edu.upc.dsa.minim.Domain.Entity.VO.LP;

public class Order {

    //Atributos
    String userId;
    LinkedList<LP> elements;

    //Contructor
    public Order(){} //Constructor vacio para hacer la magia
    public Order(String s) {
        this.userId = s;
        this.elements = new LinkedList<LP>(); // Inicializamos la lista
    }

    // Getters y Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LinkedList<LP> getElements() {
        return elements;
    }

    public void setElements(LinkedList<LP> elements) {
        this.elements = elements;
    }

    //Funciones
    public void addLP(int i, String b001) {
        this.elements.add(i,b001);
    }

    public Object getLP(int i) {
        return elements.get(i);
    }
}
