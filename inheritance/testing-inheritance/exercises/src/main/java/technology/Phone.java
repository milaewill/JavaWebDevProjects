package technology;

public class Phone extends Computer {
    private String carrier;


    public Phone(String brand, String model, int storageCapacity, String carrier) {
        super(brand, model, storageCapacity);
        this.carrier = carrier;
    }

    public String getCarrier() {
        return carrier;
    }

    public void makeCall(String number) {
        System.out.println("Calling... " + number);
    }
}
