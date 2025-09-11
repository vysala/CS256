//Program: Sum of Digits using Different Loops
public class SumOfDigitsAllLoops {
    public static void main(String[] args) {
        int num = 5678;

        // --- Using while loop ---
        int n1 = num;
        int sum1 = 0;
        while (n1 > 0) {
            int digit = n1 % 10;
            sum1 += digit;
            n1 = n1 / 10;
        }
        System.out.println("Sum using while loop = " + sum1);

        // --- Using do-while loop ---
        int n2 = num;
        int sum2 = 0;
        do {
            int digit = n2 % 10;
            sum2 += digit;
            n2 = n2 / 10;
        } while (n2 > 0);
        System.out.println("Sum using do-while loop = " + sum2);

        // --- Using for loop ---
        int sum3 = 0;
        for (int n3 = num; n3 > 0; n3 = n3 / 10) {
            int digit = n3 % 10;
            sum3 += digit;
        }
        System.out.println("Sum using for loop = " + sum3);
    }
}
