class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    
    // Default constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 2000;
        this.price = 0.0;
    }
    
    // Parameterized constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = 2023;
        this.price = 25000.0;
    }
    
    // Constructor with all parameters
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    // Copy constructor
    public Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
        this.year = other.year;
        this.price = other.price;
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + 
                          ", Year: " + year + ", Price: $" + price);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Camry");
        Car car3 = new Car("Honda", "Civic", 2022, 28000.0);
        Car car4 = new Car(car3); // Copy constructor
        
        System.out.println("Car 1:"); car1.displayInfo();
        System.out.println("Car 2:"); car2.displayInfo();
        System.out.println("Car 3:"); car3.displayInfo();
        System.out.println("Car 4 (copy):"); car4.displayInfo();
    }
}