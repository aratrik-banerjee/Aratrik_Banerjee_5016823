public class Computer {
    // Required parameters
    private String CPU;
    private int RAM;

    // Optional parameters
    private int storage;
    private boolean graphicsCard;
    private String operatingSystem;

    // Private constructor to enforce the use of the Builder
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    public String getCPU() {
        return CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getStorage() {
        return storage;
    }

    public boolean hasGraphicsCard() {
        return graphicsCard;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    // toString method to display the computer's configuration
    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + "GB, Storage=" + storage + "GB, GraphicsCard=" + graphicsCard
                + ", OperatingSystem=" + operatingSystem + "]";
    }

    // Static nested Builder class
    public static class ComputerBuilder {
        // Required parameters
        private String CPU;
        private int RAM;

        // Optional parameters
        private int storage = 0;
        private boolean graphicsCard = false;
        private String operatingSystem = "No OS";

        public ComputerBuilder(String CPU, int RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public ComputerBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        // Build method to create an instance of Computer
        public Computer build() {
            return new Computer(this);
        }
    }
}
