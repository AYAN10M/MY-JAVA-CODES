class AccessModifierExample {
    int a;
    int b;
    private int c;

    // setter method: to set the value of c by passing the value as an argument
    void setc(int i){
        c = i;
    }

    // getter method to get the value of c
    int getc(){
        return c;
    }
}

class Test{
    public static void main(String[] args) {
        AccessModifierExample obj = new AccessModifierExample();

        obj.a = 5;
        obj.b = 10;
        
        // Error: c has private access in AccessModifierExample
        // obj.c = 15;
        
        // setting the value of c using setter method
        obj.setc(15);

        System.out.println("Value of a: " + obj.a);
        System.out.println("Value of b: " + obj.b);

        // getting the value of c using getter method
        System.out.println("Value of c: " + obj.getc());
    }
}