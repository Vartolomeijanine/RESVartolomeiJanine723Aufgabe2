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

    // CRUD Character

    /**
     * Adds character to the InMemory repository.
     * @param character
     */
    public void addCharacter(Character character) {
        for( Character characterFromList : characterList) {
            if(characterFromList.getId() == character.getId()) {
                throw new IllegalArgumentException("Character already exists");
            }
        }
        characterList.add(character);
    }

    /**
     * Gets all characters from the InMemory repository.
     * @return
     */
    public List<Character> getCharacterList() {
        return characterList;
    }

    /**
     * Updates characters from the InMemory repository.
     * @param id
     * @param newName
     * @param newDorf
     */
    public void updateCharacter(int id, String newName, String newDorf) {
        for (model.Character character : characterList) {
            if (character.getId() == id) {
                character.setName(newName);
                character.setDorf(newDorf);
            }
        }
    }

    /**
     * Deletes characters from the InMemory repository.
     * @param id
     */
    public void deleteCharacter(int id) {
        characterList.removeIf(character -> character.getId() == id);
    }

    // Helper method: buy

    /**
     * Helper method in order for characters to buy products.
     * @param characterID
     * @param productName
     */
    public void buyProducts(int characterID, String productName) {
        for (Character character : characterList) {
            if (character.getId() == characterID) {
                for (Product product : productList) {
                    if (product.getName().equalsIgnoreCase(productName)) {
                        character.getProducts().add(product);
                    }
                }
            }
        }
    }



    
}
