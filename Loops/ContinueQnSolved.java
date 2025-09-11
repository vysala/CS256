package LoopsDemo;

public class ContinueQnSolved {
    public static void main(String[] args) {
        
    
    //Program1: PrintOddNumbers
/*for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(i);
        } */

//Program 2. Skip Multiples of 5

/*int i = 1;
        while (i <= 30) {
            if (i % 5 == 0) {
                i++; // Increment the counter before continue to avoid infinite loop
                continue; // Skip multiples of 5
            }
            System.out.println(i);
            i++; 
        } */

// Program 3: Skip Numbers Divisible by 3 and 4
           for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                continue; // Skip numbers divisible by both 3 and 4
            }
            System.out.println(i);
        }

   

}

    }

    


