public class NestedIfExample {
    public static void main(String[] args) {
        int num = 15;

        if (num > 0) {   // outer if
            System.out.println("The number is positive");

            if (num % 2 == 0) {   // inner if
                System.out.println("The number is divisible by 2");
            } else {
                System.out.println("The number is not divisible by 2");
            }
        } else {
            System.out.println("The number is not positive");
        }
    }

