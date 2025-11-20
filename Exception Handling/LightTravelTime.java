package ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;

// Input twenty ( String) and see what happens
public class LightTravelTime {
  public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     double distMiles = 0.0;
     double lightTravelTimeSec = 0.0;
  
     System.out.print("Enter distance in miles: ");

     try {
        distMiles = scnr.nextDouble();
        lightTravelTimeSec = distMiles / 186282.0;
     }
     catch (InputMismatchException e) {
        System.out.println("Must enter a number!");
     }

     System.out.println(lightTravelTimeSec);
  }
}