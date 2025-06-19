package inventoryManagement;
import java.util.HashMap;
import java.util.Map;

class Product {
    String productId;
    String productName;
    int quantity;
    double price;

    Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + productId + ", Name: " + productName +
               ", Quantity: " + quantity + ", Price: ₹" + price;
    }
}

class Inventory {
    Map<String, Product> inventory = new HashMap<>();

    void addProduct(Product p) {
        if (inventory.containsKey(p.productId)) {
            System.out.println("Product already exists.");
        } else {
            inventory.put(p.productId, p);
            System.out.println("Product added.");
        }
    }

    void updateProduct(String id, String name, int quantity, double price) {
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.productName = name;
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    void deleteProduct(String id) {
        if (inventory.remove(id) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }
}

public class inventoryManagement {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product("101", "Laptop", 10, 60000);
        Product p2 = new Product("102", "Keyboard", 30, 1200);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.displayInventory();

        inventory.updateProduct("101", "Gaming Laptop", 5, 80000);
        inventory.displayInventory();

        inventory.deleteProduct("102");
        inventory.displayInventory();
    }
}
