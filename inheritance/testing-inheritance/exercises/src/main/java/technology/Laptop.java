package technology;

public class Laptop extends Computer {
    private double screenSize;

    public Laptop(String brand, String model, int storageCapacity, double screenSize) {
        super(brand, model, storageCapacity);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void openLaptop() {
        System.out.println("Laptop is open");
    }
}
