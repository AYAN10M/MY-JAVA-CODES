import java.util.Scanner;

public class kilometer_miles
{
	public static void main(String args[])
	{
		double in_miles;
		Scanner S = new Scanner(System.in);

		System.out.print("Enter the distance in miles:\t");
		in_miles = S.nextDouble();

		System.out.println(in_miles + " = " + in_miles*1.60934);
		S.close();
	}
}