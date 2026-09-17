package FunctionsTopic;

public class EvenOdd {
// Function to check even or odd using ternary operator
    static void checkEvenOdd(int n) {
        System.out.println((n % 2 == 0? n + " is Even" :n + " is Odd"));
               }

   /* Try solving the same problem using conditional statements once you learn about it
    static void checkEvenOdd(int n) {
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }*/

    public static void main(String[] args) {
        checkEvenOdd(10);
        checkEvenOdd(7);
    }
}
