package ExceptionHandling;

/* Using throw new ArithmeticException(...) stops the program immediately if the condition is
not met, which is important when we want to enforce a rule strictly (like age restriction). 
The exception allows us to provide a clear, descriptive message about why the program stopped.*/
public class ThrowUsage {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}