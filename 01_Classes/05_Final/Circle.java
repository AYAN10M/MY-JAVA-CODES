public class Circle
{
    int radius;
    final double pi = 3.14;

    Circle(int radius) {
        this.radius = radius;
    }

    double area(){
        double area = pi * radius * radius;
        return area;
    }
    

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("The area of the circle is :\t" + c1.area());
    }
}