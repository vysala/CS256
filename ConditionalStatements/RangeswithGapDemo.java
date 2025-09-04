package ConditionalStatements;
/*Movie theaters often give ticket discounts to children (anyone 12 and under) and seniors (anyone 65 and older). The gap is the group of people aged 13 to 64. 
An if-else statement can be used to detect such ranges with gaps. */
import java.util.Scanner;

public class RangeswithGapDemo {
  public static void main(String[] args) {
     int userAge;
     int movieTicketPrice;     
     Scanner in = new Scanner(System.in);

     System.out.println("Enter your age: ");
     userAge = in.nextInt();

     if (userAge <= 12) {         // Age 12 and under
        System.out.println("Child ticket discount.");
        movieTicketPrice = 8;
     }
     else if (userAge >= 65) {    // Age 65 and older
        System.out.println("Senior ticket discount.");
        movieTicketPrice = 10;
     }
     else {                       // All other ages
        movieTicketPrice = 14;
     }

     System.out.println("Ticket price: $" +
        movieTicketPrice);
  }
}


