package Arrays;
import java.util.Scanner;
public class Ranking {
    public static void main(String[] args) {
        
    
Scanner scnr = new Scanner(System.in);

      int[] PeopleRanking = new int[5]; 
      int nthRanking;                  // User input, Nth ranking

      PeopleRanking[0] = 122; // HighestScore in Olympics
      PeopleRanking[1] = 119; // Second Highest 
      PeopleRanking[2] = 117; // Third Highest
      PeopleRanking[3] = 117; // Fourth Highest
      PeopleRanking[4] = 116; // Fifth Highest

      System.out.print("Enter N (1-5): ");
      nthRanking = scnr.nextInt();

      if ((nthRanking >= 1) && (nthRanking <= 5)) {
         System.out.print("The " + nthRanking + "th ranking person scored ");
         System.out.println(PeopleRanking[nthRanking - 1] + " points.");
      }
   }
}

