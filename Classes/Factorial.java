import java.util.Scanner;

public class Factorial {
    int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial f1 = new Factorial();
        
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        
        if (num < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = f1.factorial(num);
            System.out.println("The factorial of " + num + " is: " + result);
        }
        
        sc.close();
    }
}

