package se.lexicon;

import java.util.ArrayList;
import java.util.Scanner;

public class MainOrder {

    ArrayList<Product> productList = new ArrayList<>();
    Order order = new Order();
    Scanner scanner = new Scanner(System.in);

    void main() {

        productList.add(new Product(1, "milk", 23.5));
        productList.add(new Product(2, "cheese", 95.5));
        productList.add(new Product(3, "chocolate", 46.5));
        productList.add(new Product(4, "fish", 105.5));
        boolean running = true;
        do {
            menu();
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    showAllProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    calculateTotal();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    IO.println("Existing .. the shops!");
            }

        } while (running);

    }

    private void calculateTotal() {

        double total = order.calculateTotal();
        IO.println("The total of your shop are: $" + total);
    }

    private void removeProduct() {
        IO.println("Enter product Id to remove it:");
        int id = scanner.nextInt();
        for (Product p : order.getProducts()) {
            if (p.getProductId() == id) {
                order.removeProduct(p);
                IO.println("product with id " + id + " removed!");
            }

        }
    }

    private void addProduct() {

        IO.println("Enter product id to add to List");
        int productId = scanner.nextInt();

        for (Product p : productList) {
            if (p.getProductId() == productId) {
                order.addProduct(p);
                IO.println("Product with id " + productId + " is added to your order");
            }
        }

    }

    public void menu() {
        IO.println("Welcome to the shops center!");
        IO.println("1- show all Products");
        IO.println("2- addProduct");
        IO.println("3- removeProduct");
        IO.println("4- calculate total");
        IO.println("0- Exit");
        IO.println("chose an option");
    }

    public void showAllProducts() {

        for (Product p : productList) {
            IO.println(p);
        }

    }


}
