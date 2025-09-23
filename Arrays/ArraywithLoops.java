package Arrays;

import java.util.Scanner;

public class ArraywithLoops {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      final int NUM_ELEMENTS = 8;             // Number of elements in array
      int[] input = new int[NUM_ELEMENTS]; // User numbers
      int i;                                  

      System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
      for (i = 0; i < input.length; ++i) {
         input[i] = in.nextInt();
        
      }
      
      System.out.print("You entered: ");
      for (i = 0; i < input.length; ++i) {
         System.out.print(input[i] + " ");
      }
      System.out.println();
   }
}