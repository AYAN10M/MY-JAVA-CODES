import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("Enter num 1:\t");
        num1 = sc.nextInt();
        System.out.println("Enter num 2:\t");
        num2 = sc.nextInt();

        try{
            result = num1 / num2;
            System.out.println(result);
        }
        // the benefit using specific exception class is that we can provide specific message for specific exception
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed !!");
        }
        catch(Exception e){
            System.out.println("Something went wrong !!");
        }
        /*
            catch(){

            }
        */

        /*
            We can have multiple catch blocks for a single try block just we have to make sure that the specific exception class should be written first and the parent class should be written at the end.
        */ 
    }
}
