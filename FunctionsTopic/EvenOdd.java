package FunctionsTopic;

public class EvenOdd {
// Function to check even or odd
    static void checkEvenOdd(int n) {
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }

    public static void main(String[] args) {
        checkEvenOdd(10);
        checkEvenOdd(7);
    }
}
