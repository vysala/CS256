
/* Write a program that uses the method sqrt of the class Math and outputs
 the square roots of the first 25 positive integers. (Your program must output
 each number and its square root.) Format the output with 4 character wide for integer and 12 character wide for floating point number.
 */

package LoopsDemo;

public class ForLoopForSqrt {
    public static void main(String[] args)
    {
		System.out.printf("%6s  %12s%n", "Number", "Sqrt(Number)"); // print the string, right-aligned in a field 6 characters wide and with a 12-character-wide field for the second string
        for (int num = 1; num <= 25; num++)
            System.out.printf("%4d %12.2f%n", num, Math.sqrt(num));  
                  
            /*      %4d: Format as a decimal integer (d), right-aligned in a field 4 characters wide.
                    %12.2f: Format as a floating-point number (f), in a field 12 characters wide.
                    .2: Round to 2 digits after the decimal point. */
    }
}


