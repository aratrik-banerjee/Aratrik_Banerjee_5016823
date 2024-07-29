public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Tablet", "Electronics"),
            new Product("P004", "Smartwatch", "Electronics"),
            new Product("P005", "Headphones", "Accessories")
        };

        // Linear Search Test
        System.out.println("Linear Search:");
        Product foundProduct = LinearSearch.linearSearch(products, "Smartwatch");
        System.out.println(foundProduct != null ? "Found: " + foundProduct : "Product not found.");

        // Binary Search Test
        System.out.println("Binary Search:");
        foundProduct = BinarySearch.binarySearch(products, "Smartwatch");
        System.out.println(foundProduct != null ? "Found: " + foundProduct : "Product not found.");
    }
}
