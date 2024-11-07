import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("Enter num 1:\t");
        num1 = sc.nextInt();
        System.out.println("Enter num 2:\t");
        num2 = sc.nextInt();

        String str = null;

        try{
            result = num1 / num2;
            System.out.println(str.length());
            System.out.println(result);
        }
        // the benefit using specific exception class is that we can provide specific message for specific exception
        catch(ArithmeticException e){
            // This will print the exception message and the stack trace of the exception that occured
            System.out.println(e);
            System.out.println("Division by zero is not allowed !!");
        }
        catch(NullPointerException e){
            System.out.println(e);
            System.out.println("Null pointer exception !!");
        }
        // If we kept this parent class "exception" at the top of all the catch block then it will catch all the exceptions and the specific exception will not be caught and pontenically the program will not work as expected and causes error too.
        catch(Exception e){
            System.out.println(e);
            System.out.println("Some exception occured !!");
        }
        /*
            catch(){

            }
        */

        /*
            We can have multiple catch blocks for a single try block just we have to make sure that the specific exception class should be written first and the parent class should be written at the end.
        */
        sc.close();
    }
}
