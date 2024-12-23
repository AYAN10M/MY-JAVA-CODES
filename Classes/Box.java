import java.util.Scanner;

public class Box {
    // Instance Variable

    double length;
    double width;
    double height;

    // Non Parameterized Constructor
    Box() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        this.length = sc.nextFloat();
        System.out.println("Enter the width: ");
        this.width = sc.nextFloat();
        System.out.println("Enter the height: ");
        this.height = sc.nextFloat();

        sc.close();
    }

    // Parameterized Constructor
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double volume() {
        return length * width * height;
    }
}

class BoxTest {

    public static void main(String args[]) {
        Box b1 = new Box();
        System.out.println(b1.volume());
    }
}
