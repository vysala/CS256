package LoopsDemo;

public class SumNaturalNumbers {
public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);
    }

}
