import java.util.Scanner;

class Test{
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
        // Exeption class is the parent class of all the exception classes and "e" is the object of Exception class 
        catch(Exception e){
            System.out.println("Something went wrong !!");
        }

    }
}