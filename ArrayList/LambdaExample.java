package ArrayListPgms;
// Lambda to filter odd numbers
import java.util.ArrayList;

public class LambdaExample {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Create a list of numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(21);
        numbers.add(30);
        numbers.add(45);
        numbers.add(50);

        System.out.println("Original list: " + numbers);

        // Use a lambda to remove all odd numbers
        // for each element n in the list, it checks n%2 !=0, if the condition is true , that number will be removed from the list.
        numbers.removeIf(n -> n % 2 != 0);
       

        System.out.println("After removing odd numbers: " + numbers);
    }
}
