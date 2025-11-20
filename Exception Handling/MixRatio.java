package ExceptionHandling;

/* Division rules for floating-point numbers say:

0.0 / nonzero → 0.0

nonzero / 0.0 → ±Infinity

0.0 / 0.0 → undefined, so Java produces NaN

Try value 0.0 and 0.0 as input and see how the program handles it .

*/

import java.util.Scanner;
public class MixRatio {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double gasVolume;
      double oilVolume;
      double mixRatio = 0.0;

      System.out.println("Enter the 2 inputs : ");

      try {
         gasVolume = scnr.nextDouble();
         oilVolume = scnr.nextDouble();

         mixRatio = gasVolume / oilVolume;

      
         if (Double.isNaN(mixRatio)) {
            throw new Exception("mixRatio is NaN!");
         }

         if (Double.isInfinite(mixRatio)) {
            throw new Exception("mixRatio is infinite!");
         }

                  System.out.println("mixRatio: " + mixRatio);
      }
      catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}









