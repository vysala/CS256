

public class TraceCode1Functions {
    
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        
        int result = multiply(add(x, y), subtract(x, y));
        
        System.out.println("Final Result = " + result);
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
}
