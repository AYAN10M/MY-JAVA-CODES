package ObjectOrientedConcepts;

class Mobile
{
    String brand;
    int price;
    String type;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + type);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.type = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1000;
        obj2.type = "SmartPhone";

        obj1.show();
        obj2.show();
    }
}
