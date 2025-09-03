package FunctionsTopic;


public class TraceCode3Functions {
    public static void main(String[] args) {
        int n = 7;
        int result = square(n) + doubleValue(n);
        System.out.println("Final = " + result);
    }

    public static int square(int x) {
        return x * x;
    }

    public static int doubleValue(int x) {
        return x * 2;
    }
}
