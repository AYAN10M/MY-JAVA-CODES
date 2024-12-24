// This is an example of method overloading

class AddFunc {
    // Method 1

    int add(int a, int b) {
        return a + b;
    }

    // Method 2
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3
    double add(double a, double b) {
        return a + b;
    }

    // Method 4
    double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class Addition {

    public static void main(String args[]) {
        AddFunc f1 = new AddFunc();

        // this calls method 2
        System.out.println(f1.add(9, 1, 1));

        // this calls method 3
        System.out.println(f1.add(6.9, 11.11));
    }
}
