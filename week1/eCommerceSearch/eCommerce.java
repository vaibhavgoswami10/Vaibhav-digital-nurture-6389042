import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

public class eCommerce {

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compareResult = products[mid].productName.compareToIgnoreCase(targetName);

            if (compareResult == 0) {
                return products[mid];
            } else if (compareResult < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Smartphone", "Electronics"),
                new Product(3, "Shoes", "Footwear"),
                new Product(4, "Book", "Education"),
                new Product(5, "Watch", "Accessories")
        };

        System.out.println("=== Linear Search ===");
        Product result1 = linearSearch(products, "Shoes");
        System.out.println(result1 != null ? "Found: " + result1 : "Product not found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        System.out.println("\n=== Binary Search ===");
        Product result2 = binarySearch(products, "Watch1");
        System.out.println(result2 != null ? "Found: " + result2 : "Product not found");
    }
}
