package view;

import model.*;
import controller.*;

import java.util.Scanner;

public class View {

    private final Controller controller = new Controller();
    private final Scanner scanner = new Scanner(System.in);

    public void menu() {
        while (true) {

            // First object
            System.out.println("Welcome to Naruto!");
            System.out.println("1. Add Product");
            System.out.println("2. Show All Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");



            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> showAllProducts();
                case 3 -> updateProduct();
                case 4 -> deleteProduct();



            }
        }
    }

    // CRUD Film

    /**
     * Creates product to the InMemory repository.
     */
    private void addProduct() {
        System.out.println("Enter the product name");
        String name = scanner.nextLine();
        System.out.println("Enter the product price");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the product region");
        String region = scanner.nextLine();

        controller.addProduct(new Product(name, price, region));
    }

    /**
     * Gets all products from the InMemory repository.
     */
    private void showAllProducts() {
        controller.getProductList().forEach(System.out::println);
    }

    /**
     * Updates products to the InMemory repository.
     */
    private void updateProduct() {
        showAllProducts();
        System.out.println("Enter the product name");
        String name = scanner.nextLine();
        System.out.println("Enter the product price");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the product region");
        String region = scanner.nextLine();
        controller.updateProduct(name, price, region);
    }

    /**
     * Deletes products from the InMemory repository.
     */
    private void deleteProduct() {
        System.out.println("Enter the product name");
        String name = scanner.nextLine();
        controller.deleteProduct(name);
    }




}
