import java.util.Scanner;

public class calculate_percentage {
    public static void main(String args[])
    {
    	Scanner S = new Scanner(System.in);

    	int no_Subjects, marks, max_marks, sum = 0;

    	System.out.print("\nEnter the number of subjects:\t");
    	no_Subjects = S.nextInt();
    	

    	System.out.print("\nEnter the maximum no of marks that can be obtained in each subject:\t");
    	max_marks = S.nextInt();

    	for (int i = 1; i <= no_Subjects; i++) {
    		System.out.print("\nEnter the marks obtained in subject " + i + ":\t");
    		marks = S.nextInt();
    		sum += marks;
    	}

    	System.out.println("\nPercentage obtained:\t" + (sum / (double)(no_Subjects * max_marks)) *100 + "%");
    	S.close();
    }
}
