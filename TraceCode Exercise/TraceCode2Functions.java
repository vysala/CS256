

public class TraceCode2Functions {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int result = sumTimesTwo(a, b);
        System.out.println("Result = " + result);
    }

    public static int sumTimesTwo(int x, int y) {
        int s = x + y;
        return s * 2;
    }
}
