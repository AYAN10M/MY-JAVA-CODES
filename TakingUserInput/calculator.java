import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);


        int num1, num2, choice;

        while (true) {

        System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
        System.out.println("\nEnter the operation you wanted to perform:");
        choice = S.nextInt();

        if (choice == 5) {
            S.close();
            return;
        }

        System.out.print("\nEnter the num 1:\t");
        num1 = S.nextInt();

        System.out.print("\nEnter the num 2:\t");
        num2 = S.nextInt();

        

        switch (choice) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                break;
            default:
                break;
        }
        }
    }
}
