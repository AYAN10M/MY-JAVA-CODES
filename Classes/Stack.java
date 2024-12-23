import java.util.Scanner;

class Stack {

    int size;
    int top;
    int[] stack;

    // initialize the stack
    Stack()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        this.size = sc.nextInt();

        this.top = -1;
        this.stack = new int[size];
        
    }

    boolean isEmpty()
    {
        if (top == -1) {
            return true;
        }
        return false;
    }

    boolean isFull()
    {
        if (top == size - 1) {
            return true;
        }
        return false;
    }

    void push(int data)
    {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        stack[++top] = data;
    }

    int pop()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top--];
    }

    int peek()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }
}

class StackTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        while(true)
        {
            System.out.println("Main Menu");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the data: ");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    System.out.println("Popped element: " + stack.pop());
                    break;
                case 3:
                    System.out.println("Top element: " + stack.peek());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
