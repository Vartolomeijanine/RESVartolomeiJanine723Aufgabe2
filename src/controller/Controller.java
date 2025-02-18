package controller;
import model.*;
import model.Character;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Controller {

    private List<Product> productList = new ArrayList<>();
    private List<Character> characterList= new ArrayList<>();

    // CRUD Product

    /**
     * Adds product to the InMemory repository.
     * @param product
     */
    public void addProduct(Product product) {
        productList.add(product);
    }

    /**
     * Gets all products from the InMemory repository.
     * @return
     */
    public List<Product> getProductList() {
        return productList;
    }

    /**
     * Updates products from the InMemory repository.
     * @param newName
     * @param newPrice
     * @param newRegion
     */
    public void updateProduct(String newName, double newPrice, String newRegion) {
        for (Product product : productList) {
            if (Objects.equals(product.getName(), newName)) {
                product.setName(newName);
                product.setPrice(newPrice);
                product.setRegion(newRegion);
            }
        }
    }

    /**
     * Deletes products from the InMemory repository.
     */
    public void deleteProduct(String name) {
        productList.removeIf(product -> Objects.equals(product.getName(), name));
    }

    public Product getProduct(String productName) {
        for (Product product : productList) {
            if(product.getName().equalsIgnoreCase(productName)){
                return product;
            }
        }
        return null;
    }



    
}
