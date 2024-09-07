
import java.util.Scanner;

public class methods_string {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter your name:\t");
        String name = S.nextLine();

        // to get the length of the string
        int len = name.length();
        System.out.println("The length of the string is:\t" + len);

        // convert the string to lowercase
        String lowercaseString = name.toLowerCase();
        System.out.println(lowercaseString);

        // convert the string to uppercase
        String uppercaseString = name.toUpperCase();
        System.out.println(uppercaseString);

        // returns the string after removing all the leading and trailing spaces from original string
        String trimmedString = name.trim();
        System.out.println(trimmedString);


        
        S.close();
    }
}