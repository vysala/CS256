package ConditionalStatements;

public class NestedIfDemo {
    public static void main(String[] args) {
        int score = 95;  // you can change this value to test

        if (score >= 50) {
            System.out.println("You passed the exam.");

            if (score >= 90) {
                System.out.println("Excellent work! You got an A.");
            } else if (score >= 75) {
                System.out.println("Good job! You got a B.");
            } else {
                System.out.println("You got a C.");
            }

        } else {
            System.out.println("You failed the exam.");
            if (score < 30) {
                System.out.println("You need to put in a lot more effort.");
            } else {
                System.out.println("Almost there, keep practicing!");
            }
        }
    }
}
