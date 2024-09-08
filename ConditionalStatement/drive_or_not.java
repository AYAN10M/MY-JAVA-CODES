package ConditionalStatement;
import java.util.Scanner;

public class drive_or_not {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter your age:\t");
        int age = S.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println("You are not eligible to drive.");
        }
    }
}
