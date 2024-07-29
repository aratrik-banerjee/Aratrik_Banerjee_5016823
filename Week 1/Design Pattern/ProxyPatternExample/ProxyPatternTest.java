public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image will be loaded and displayed only when requested
        image1.display(); // Loads image1 and displays it
        image1.display(); // Uses cached image1

        image2.display(); // Loads image2 and displays it
        image2.display(); // Uses cached image2
    }
}
