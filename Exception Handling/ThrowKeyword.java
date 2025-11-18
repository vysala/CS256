package ExceptionHandling;

public class ThrowKeyword {
void findSquareRoot(int num) { 
        if (num < 0) {
            throw new ArithmeticException("Number is negative, cannot calculate square root.");
        } 
        else {
            System.out.println(Math.sqrt(num));
        }
    }

    public static void main(String[] args) {
        ThrowKeyword tk = new ThrowKeyword();
        
     //  try {
            tk.findSquareRoot(-1);
      // } 
       //  catch (ArithmeticException e) {
            System.out.println("Data is not valid.");
        //}
    }

}
