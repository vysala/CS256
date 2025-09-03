package FunctionsTopic;

//Function Calls Inside Function
public class TraceCode4Functions {
    public static void main(String[] args) {
        int num = 5;
        int result = compute(num);
        System.out.println("Answer = " + result);
    }

    public static int compute(int x) {
        return square(x) - doubleValue(x);
    }

    public static int square(int a) {
        return a * a;
    }

    public static int doubleValue(int b) {
        return b * 2;
    }

    
}
