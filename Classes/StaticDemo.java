package ClassesDemo;

public class StaticDemo {
    static int b=15;

    public static void print(){
        System.out.println("I am inside the print function");
    }
    public static void main(String[] args) {
    int a=10;
    String s="Hello";
    System.out.println(s + a + b);
    print();

    }
    
    }
