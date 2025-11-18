package ExceptionHandling;

public class Exception1 {
public static void main(String[] args) {
    
 /*  try {
    String s=null;
    System.out.println(s.length());
       
   } catch (NullPointerException e) {
    // TODO: handle exception
    System.out.println("Null pointer exception occured ");
   }
  
   try{
   String num="abc";
   int value=Integer.parseInt(num);
   }
   catch(NumberFormatException e){
    
   }*/
    
    try {
    int[] myarr={1,2,3,4};
    System.out.println(myarr[10]);
    int result=10/0;
    
    } catch (ArrayIndexOutOfBoundsException e) {
        // TODO: handle exception
      System.out.println("Arrayindexerror");
   }
  catch(ArithmeticException e){
       System.out.println("Cannot divide by zero");
   }
  finally{
    System.out.println("This will always get executed ");
  } 

    System.out.println("Program finished");
    
}
}
