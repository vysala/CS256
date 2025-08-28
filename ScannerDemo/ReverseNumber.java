package ScannerDemo;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int rev = 0;

        // Extract digits using % and / operators
        int digit = num % 10;      // last digit
        rev = rev * 10 + digit;    // add to reversed number
        num = num / 10;            // remove last digit

        digit = num % 10;          // second digit
        rev = rev * 10 + digit;
        num = num / 10;

        digit = num % 10;          // first digit
        rev = rev * 10 + digit;

        System.out.println("Reversed number: " + rev);
    }
}
