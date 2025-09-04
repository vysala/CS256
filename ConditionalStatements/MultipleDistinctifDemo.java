package ConditionalStatements;

import java.util.Scanner;

public class MultipleDistinctifDemo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int age;

      System.out.print("Enter age: ");
      age = scnr.nextInt();

      // Note that more than one "if" statement can execute
      if (age < 16) {
         System.out.println("Enjoy your early years.");
      }

      if (age > 15) {
         System.out.println("You are old enough to drive.");
      }

      if (age > 17) {
         System.out.println("You are old enough to vote.");
      }

      if (age > 24) {
         System.out.println("Most car rental companies will rent to you.");
      }

      if (age > 34) {
         System.out.println("You can run for president.");
      }
   }
}