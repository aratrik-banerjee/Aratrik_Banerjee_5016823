public class ComputerBuilderTest {
    public static void main(String[] args) {
        // Creating a Computer with all optional components
        Computer gamingPC = new Computer.ComputerBuilder("Intel i9", 32)
                .setStorage(2000)
                .setGraphicsCard(true)
                .setOperatingSystem("Windows 10")
                .build();

        // Creating a Computer with only required components
        Computer basicPC = new Computer.ComputerBuilder("Intel i5", 8)
                .build();

        // Creating a Computer with some optional components
        Computer officePC = new Computer.ComputerBuilder("AMD Ryzen 5", 16)
                .setStorage(512)
                .setOperatingSystem("Ubuntu")
                .build();

        // Displaying the configurations
        System.out.println(gamingPC);
        System.out.println(basicPC);
        System.out.println(officePC);
    }
}
