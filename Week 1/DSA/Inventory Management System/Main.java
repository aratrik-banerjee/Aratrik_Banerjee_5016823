public class Main {
    public static void main(String[] args) {
        InventoryManagement inventoryManagement = new InventoryManagement();

        Product product1 = new Product("P001", "Laptop", 10, 800.00);
        Product product2 = new Product("P002", "Smartphone", 20, 500.00);
        Product product3 = new Product("P003", "Tablet", 15, 300.00);

        inventoryManagement.addProduct(product1);
        inventoryManagement.addProduct(product2);
        inventoryManagement.addProduct(product3);

        inventoryManagement.displayInventory();

        Product updatedProduct1 = new Product("P001", "Laptop", 12, 820.00);
        inventoryManagement.updateProduct(updatedProduct1);

        inventoryManagement.displayInventory();

        inventoryManagement.deleteProduct("P002");
        inventoryManagement.displayInventory();
    }
}
