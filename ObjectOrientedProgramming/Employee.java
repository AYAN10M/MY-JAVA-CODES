import java.util.Scanner;

public class Employee
{
    int id;
    float salary;
    String name;

    // default constructor
    Employee() {}

    // parameterized constructor
    Employee(int id, float salary, String name)
    {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    void displaySalary()
    {
        System.out.println(name + " has a salary of " + salary);
    }

    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);

        Employee employee1 = new Employee(245, 7500, "Rohit");
        employee1.displaySalary();

        Employee employee2 = new Employee();
        System.out.print("\nEnter the name of the Employee:\t");
        employee2.name = S.nextLine();
        
        System.out.print("\nEnter the Employee id:\t");
        
        employee2.id = S.nextInt();
        
        
        S.nextLine(); 
        
        System.out.print("\nEnter the Employee salary:\t");
        employee2.salary = S.nextFloat();
        
        employee2.displaySalary();
        S.close();
    }
}
