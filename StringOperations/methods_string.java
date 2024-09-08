
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

        // returns a substring of the original string from start index to end index. Start index is inclusive and end index is exclusive
        System.out.print("Enter the start index:\t");
        int start = S.nextInt();
        System.out.print("Enter the end index:\t");
        int end = S.nextInt();
        String subString = name.substring(start, end);
        System.out.println(subString);

        // returns a new string after replacing all the occurrences of old character with new character 
        System.out.print("Enter the old character:\t");
        char oldChar = S.next().charAt(0);
        System.out.print("Enter the new character:\t");
        char newChar = S.next().charAt(0);
        String replacedString = name.replace(oldChar, newChar);
        System.out.println(replacedString);

        // returns true if string starts with the given prefix
        System.out.print("Enter the prefix:\t");
        String prefix = S.next();
        boolean startsWith = name.startsWith(prefix);
        System.out.println(startsWith);

        // returns true if string ends with the given suffix
        System.out.print("Enter the suffix:\t");
        String suffix = S.next();
        boolean endsWith = name.endsWith(suffix);
        System.out.println(endsWith);
        
        // returns character at the given index
        System.out.print("Enter the index:\t");
        int index = S.nextInt();
        char charAt = name.charAt(index);
        System.out.println(charAt);

        // returns true if the given string is equal to the another string
        System.out.print("Enter the another string:\t");
        String anotherString = S.next();
        boolean equals = name.equals(anotherString);
        System.out.println(equals);

        // returns true if the given string is equal to the another string ignoring the case\
        System.out.print("Enter the another string:\t");
        String anotherString2 = S.next();
        boolean equalsIgnoreCase = name.equalsIgnoreCase(anotherString2);
        System.out.println(equalsIgnoreCase);

        
        
        S.close();
    }
}