import java.util.Scanner;

class Stack {
    int size;
    int[] stack;
    int top;

    Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    int isFull() {
        if (top == size - 1) {
            return 1;
        } else {
            return -1;
        }
    }

    int isEmpty() {
        if (top == -1) {
            return 1;
        } else {
            return -1;
        }
    }

    void push(int data) {
        if (isFull() == 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = data;
        }
    }


    void pop() {
        if (isEmpty() == 1) {
            System.out.println("Underflow");  // stack is empty
        } else {
            stack[top--] = 0;
        }
    }

    int peek() {
        if (isEmpty() == 1) {
            System.out.println("Underflow");
            return -1;
        } else {
            return stack[top];
        }
    }
}


class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user to input the size of the stack
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();

        // Create an instance of the Stack class
        Stack stack = new Stack(size);

        while (true) {
            // Displaying the menu options
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Stack is Full");
            System.out.println("5. Check if Stack is Empty");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Push operation
                    System.out.print("Enter the element to push: ");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;

                case 2: // Pop operation
                    stack.pop();
                    break;

                case 3: // Peek operation
                    int topElement = stack.peek();
                    if (topElement != -1) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;

                case 4: // Check if stack is full
                    if (stack.isFull() == 1) {
                        System.out.println("Stack is full.");
                    } else {
                        System.out.println("Stack is not full.");
                    }
                    break;

                case 5: // Check if stack is empty
                    if (stack.isEmpty() == 1) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;

                case 6: // Exit
                    System.out.println("Exiting the program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}

