package TakingUserInput;

/* java.util.Scanner is a class that is part of the java.util package.
   It allows us to take various types of input from the user, such as integers, strings, floats, etc. */

   import java.util.Scanner;

public class basic {
    public static void main(String[] args) {

        // Create a new Scanner object named 'S'. This allows us to take input from the user.
        Scanner S = new Scanner(System.in);

        // Taking integer input
        // nextInt() method reads the next integer input from the user.
        // It does not consume the newline character ('\n') left in the input buffer.
        System.out.print("Enter a number: ");
        // Reads an integer
        int a = S.nextInt();
        // Prints the entered integer
        System.out.println("You entered: " + a);

        // Taking string input (word-level)
        // next() method reads a single word (up to the first space, tab, or newline).
        System.out.print("Enter a string: ");
        // Reads a single word (no spaces)
        String b = S.next();
        // Prints the entered word
        System.out.println("You entered: " + b);

        /* Important: The next() method leaves a newline ('\n') character in the buffer.
           If we call nextLine() right after next(), it will read that leftover newline, not actual input.
           Therefore, we need to consume that leftover newline by calling an extra nextLine().
        */

        // Consumes the leftover newline character so the next input works correctly.
        S.nextLine(); 

        // Taking string input (line-level)
        // nextLine() method reads the entire line of input, including spaces until the newline character is encountered.
        System.out.println("Enter a string: ");
          // Reads the entire line (spaces included)
        String c = S.nextLine();
        // Prints the entered string
        System.out.println("You entered: " + c);

        // Taking float input
        // nextFloat() method reads the next float input from the user.
        System.out.print("Enter a float: ");
        // Reads a float number
        float d = S.nextFloat();
        // Prints the entered float
        System.out.println("You entered: " + d);

        // Taking double input
        // nextDouble() method reads the next double input from the user.
        System.out.print("Enter a double: ");
        // Reads a double number
        double e = S.nextDouble();
        // Prints the entered double
        System.out.println("You entered: " + e);

        // Taking boolean input
        // nextBoolean() method reads the next boolean input (true/false) from the user.
        System.out.print("Enter a boolean: ");
        // Reads a boolean value (true or false)
        boolean f = S.nextBoolean();
        // Prints the entered boolean
        System.out.println("You entered: " + f);

        // Close the Scanner object.
        // It is important to close the Scanner when we are done to release the resources associated with it.
        S.close();
    }
}
