package FunctionsTopic;
// Chained Function Calls
public class TraceCode5Functions {
    public static void main(String[] args) {
        int result = addOne(doubleValue(subtract(10, 3)));
        System.out.println("Result = " + result);
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int doubleValue(int x) {
        return x * 2;
    }

    public static int addOne(int y) {
        return y + 1;
    }
}
