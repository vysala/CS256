package FunctionsTopic;

public class Calculator {

    public static int add(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static double divide(int a, int b){
         if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0; // or throw exception
        }

        return (double) a/b;
    }

    
 
public static void main(String[] args) {
    int x=20,y=4;
    System.out.println("Addition " + add(x,y));
    System.out.println("Subtract " + subtract(x,y));
    System.out.println("Multiply " +multiply(x, y));
    System.out.println("Divide " + divide(x, y) );
    
}
}
