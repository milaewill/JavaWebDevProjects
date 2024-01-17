package technology;

public class Program {
    public static void main(String[] args) {

        Computer computer = new Computer("Apple", "iMac", 777);
        System.out.println("Computer ID: " + computer.getId());
        computer.turnOn();

        Laptop laptop = new Laptop("Apple", "Pro", 500, 13);
        System.out.println("Laptop ID: " + laptop.getId());
        laptop.openLaptop();

        Phone phone = new Phone("Apple", "iPhone 11", 64, "Verizon");
        System.out.println("Phone ID: " + phone.getId());
        phone.makeCall("1234567890");
    }
}
