package technology;

import static technology.AbstractEntity.nextId;

public class Computer {
    private String brand;
    private String model;
    private int storageCapacity;

    public Computer(String brand, String model, int storageCapacity) {
        super();
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void turnOn() {
        System.out.println("Computer is starting up!");
    }

    public void turnOff() {
        System.out.println("Computer is shutting down");
    }


    public int getId() {
        return nextId;
    }
}

