
class Car {

    String name;
    int price;
    double fuelCapacity;

    // Default constructor
    public Car() {
        this.name = "McLaren 720S";
        this.price = 300000;
        this.fuelCapacity = 72;
    }

    // Constructor with name, price, and fuelCapacity
    public Car(String name, int price, double fuelCapacity) {
        this.name = name;
        this.price = price;
        this.fuelCapacity = fuelCapacity;
    }

    // Constructor with only price and fuelCapacity
    public Car(int price, double fuelCapacity) {
        this.name = "Ferrari";
        this.price = price;
        this.fuelCapacity = fuelCapacity;
    }

    // Display method to print car details
    public void displayDetails() {
        System.out.println("Car: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters\n");
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Car car1 = new Car();  // Using default constructor
        car1.displayDetails();

        Car car2 = new Car("McLaren 720S", 320000, 72);
        car2.displayDetails();

        Car car3 = new Car("Ferrari Pininfarina Sergio", 300000, 75);
        car3.displayDetails();

        Car car4 = new Car(260000, 72);
        car4.displayDetails();

        Car car5 = new Car(350000, 85);
        car5.displayDetails();
    }
}
