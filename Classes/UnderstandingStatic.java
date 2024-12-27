/*
    About Static keyword in Java:

    Inshort static variables are global variables and static methods are global methods. 

    Static keyword is used to create variables and methods that will exist independently of any instances created for the class.

    Static variables are shared among all instances of a class. They are initialized only once, at the start.

    Static methods can be called without creating an instance of the class. They can only access static variables. They cannot access instance variables.

    Why main is of static type in Java?
    The main method is static because it is called by the JVM before any objects are made. Since objects are not made yet, non-static methods cannot be called.

    Static methods cannot refer to this or super keywords in any way.

    Static methods cannot be overridden but can be re-declared. but static methods can be overloaded.

    Static methods can access static data members and can change the value of it.
 */

class UnderstandingStatic {

    int num1;
    static double pi;

    // Static block: It is used to initialize the static data members. It is executed before the main method at the time of classloading.
    static {
        System.out.println("Static block");
        pi = 3.14;
    }

    // Static method
    static void display() {
        System.out.println("The value of pi is " + pi);
    }

    // Static method to change the value of static variable
    static void changePi() {
        pi = 22 / 7;
    }

    // Non-static method to change the value of non-static variable
    void changeValue() {
        num1 = 10;

        // pi = 3.1415; This will give error because static variable cannot be accessed by non-static method
    }

    // Non-static method
    void show() {
        System.out.println("Non-static method");
    }

}

class UnderstandingStaticTest {

    public static void main(String[] args) {

        // Accessing static variable without creating object of class
        System.out.println(UnderstandingStatic.pi);

        // Changing the value of static variable without creating object of class
        UnderstandingStatic.pi = 3.1415;

        // Accessing static method without creating object of class
        UnderstandingStatic.display();

        // This will give error because num1 is not static
        // System.out.println(UnderstandingStatic.num1);
        UnderstandingStatic obj1 = new UnderstandingStatic();

        // Accessing static variable using object of class (not recommended)
        System.out.println(obj1.pi);

        // Changing the value of static variable using object of class (not recommended)
        obj1.pi = 3.14159;
        System.out.println(obj1.pi);

        // Accessing non-static method using object of class
        obj1.show();

        // Accessing static method using object of class
        obj1.display();
    }
}
