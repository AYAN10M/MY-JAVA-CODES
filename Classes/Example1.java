import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box b1 = new Box();

        System.out.println("Enter the length of the box: ");
        b1.length = sc.nextInt();
        System.out.println("Enter the width of the box: ");
        b1.width = sc.nextInt();
        System.out.println("Enter the height of the box: ");
        b1.height = sc.nextInt();

        System.out.println("The volume of the box is " + b1.volume());
        b1.volume();
    }
}

class Box {
    int length;
    int width;
    int height;

    int volume()
    {
        int vol = length * width * height;
        return vol;
    }
}
