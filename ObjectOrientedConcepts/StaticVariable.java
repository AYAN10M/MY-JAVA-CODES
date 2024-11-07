package ObjectOrientedConcepts;

class Mobile
{
    // These are instance variable
    String brand;
    int price;
    String model;

    // declaring a static variable
    static  String networkType = "5G";

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + model);
    }
}

public class StaticVariable {
    public static void main(String[] args) {

        // here we created a object named obj1
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.model = "16 Pro Max";

        // here we created a object named obj2
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1000;
        obj2.model = "Galaxy S24 ultra";

        obj1.show();
        obj2.show();

        // static varibale can be called using class name instead of object name
        System.out.println(Mobile.networkType);

        // we can call static variable using object but we should avoid using this 
        System.out.println(obj1.networkType);
        
    }
}

/*
 In Java, a static variable is a variable that belongs to the class itself, rather than to any specific instance of the class. This means that there is only one copy of the static variable in memory, regardless of how many objects of the class are created.

Key Points:
    Declaration: Static variables are declared using the static keyword.
    
    Access: Static variables can be accessed directly using the class name, without the need to create an object of the class.

    Sharing: All instances of the class share the same copy of the static variable.

    Use Cases: Static variables are commonly used for:

        Constants: To store values that are constant across all instances of the class.

        Counters: To keep track of the number of objects created.

        Shared Data: To store data that needs to be accessed by all instances of the class.

 */
