public class LinearSearch {
    public static Product linearSearch(Product[] products, String searchQuery) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(searchQuery)) {
                return product;
            }
        }
        return null;
    }
}
