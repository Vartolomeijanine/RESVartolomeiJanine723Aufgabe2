package model;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private int id;
    private String name;
    private String dorf;
    private List<Product> products = new ArrayList<Product>();

    public Character(int id, String name, String dorf) {
        this.id = id;
        this.name = name;
        this.dorf = dorf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDorf() {
        return dorf;
    }

    public void setDorf(String dorf) {
        this.dorf = dorf;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dorf='" + dorf + '\'' +
                ", products=" + products +
                '}';
    }
}
