package LoopsDemo;

import java.util.Random;

public class RandomDiffUsingLoops {
    public static void main(String[] args) {
        Random rand = new Random();

        // Using Math.random()
        System.out.println("Using Math.random():");
        for (int i = 0; i < 5; i++) {
            double r = Math.random(); // 0.0 <= r < 1.0
            System.out.println(r);
        }

        System.out.println("\nUsing Random.nextInt():");
        for (int i = 0; i < 5; i++) {
            int n = rand.nextInt(); // Can be negative or positive in full int range
            System.out.println(n);
        }

        System.out.println("\nUsing Random.nextInt(100):");
        for (int i = 0; i < 5; i++) {
            int n = rand.nextInt(100); // 0 <= n < 100
            System.out.println(n);
        }
    }
}
