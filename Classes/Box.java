import java.util.Scanner;

public class Box {
    // Instance Variable

    double length;
    double width;
    double height;
    
    // Non Parameterized Constructor
    Box() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        this.length = sc.nextFloat();
        System.out.print("Enter the width: ");
        this.width = sc.nextFloat();
        System.out.print("Enter the height: ");
        this.height = sc.nextFloat();

        sc.close();
    }

    // Parameterized Constructor
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Copy Constructor
    Box(Box b1) {
        this.length = b1.length;
        this.width = b1.width;
        this.height = b1.height;
    }

    // Method to calculate the volume of the box
    double volume() {
        return length * width * height;
    }
}

class BoxTest {

    public static void main(String args[]) {

        // This will call the non parameterized constructor
        Box b1 = new Box();
        System.out.println("Volume of b1: " + b1.volume());

        // This will call the parameterized constructor
        Box b2 = new Box(10, 20, 30);
        System.out.println("Volume of b2: " + b2.volume());

        // This will call the copy constructor
        Box b3 = new Box(b2);
        System.out.println("Volume of b3: " + b3.volume());

        // This will create a reference to the object b1
        Box b4;
        b4 = b1;
        System.out.println("Volume of b4: " + b4.volume());

        b4.length = 100;
        System.out.println("Volume of b1: " + b1.volume());
    }
}
