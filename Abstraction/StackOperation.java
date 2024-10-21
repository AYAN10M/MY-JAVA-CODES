import java.util.Scanner;

interface Stack
{
    void push(int item);
    int pop();
}

class Client1 implements Stack
{
    int size, top = -1;
    int[] arr = new int[size];
    public void push(int item)
    {
        if(size == top)
        {
            System.out.println("Overflow");
        }
        else
        {
            arr[++top] = item;
        }
    }

    public int pop()
    {
        if(top == -1)
        {
            System.out.println("Underflow");
            return 0;
        }
            System.out.printf(arr[top] + " ");
            return arr[top--];
    }
}

class Client2 implements Stack
{
    int size, top = -1;
    int[] arr1 = new int[size];
    public void push(int item)
    {
        if (size == top)
        {
            int[] arr2 = new int[size * 2];
            for (int i = 0; i < size; i++)
            {
                arr2[i] = arr1[i];
            }
            arr1 = arr2;
        }
        arr1[++top] = item;
    }

    public int pop()
    {
        if (top == -1)
        {
            System.out.println("Underflow");
            return 0;
        }
        else
        {
            System.out.printf(arr1[top] + " ");
            return arr1[top--];
        }
    }
}

public class StackOperation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Client1 c1 = new Client1();
        Client2 c2 = new Client2();

        System.out.print("Enter the size of the stack of client 1:\t");
        c1.size = sc.nextInt();

        System.out.print("Enter the size of the stack of client 2:\t");
        c2.size = sc.nextInt();

        while(true)
        {
            int choice;

            System.out.printf("Enter your choice:\t");
            choice = sc.nextInt();


        }
    }
}