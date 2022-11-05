package Clases;

import Clases.LP;
import java.util.*;

public class Order {

    //Atributos
    String userId;
    List<LP> elements;

    //Contructor
    public Order(){} //Constructor vacio para hacer la magia
    public Order(String s) {
        this.userId = s;
        this.elements = new LinkedList<>(); // Inicializamos la lista
    }

    // Getters y Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<LP> getElements() {
        return this.elements;
    }

    public void setElements(LinkedList<LP> elements) {
        this.elements = elements;
    }

    //Funciones
    public void addLP(int i, String nombreProducto) {
        this.elements.add(new LP(i,nombreProducto) );
    }

    public LP getLP(int i) {
        return this.elements.get(i);
    }
}
