package ExceptionHandling;
/*throw → actually throws an exception. throw used inside a method.

throws → declares that a method may throw an exception (caller must handle it). 
        throws used in the method declaration, after the parameter list. */
public class throwandthrowsDemo {

    // Method declaring that it can throw an exception
    public static void validate(int age) throws IllegalArgumentException {
        if (age < 18) {
            // actually throwing the exception. throw creates an exception object at runtime
            throw new IllegalArgumentException("Under age!");
        
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        try {
            validate(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
