package ArrayListPgms;


// Wrapper classes allow primitive values to be used as objects
public class WrapperClassExample {
  
    public static void main(String[] args) {
        
        //Autoboxing

       //Integer a=new Integer(111);  // deprecated, so use the approach given in the next line
        Integer a=111;
        Double b=4.56;
        Character c='A';
        Boolean d=true;
        String s="Hello";

         // To convert a wrapper class back to its primitive is called unboxing
 
         int x=a;  // Now took an object a and unboxed it back to int primitive type
         double y=b;

         // Few utility methods in the wrapper classes
         // Converting an int to a String using the Integer Wrapper class. This Integer class is accessed statically so we type the classname.methodname which is Integer.toString(); 
         // Also Converting double,char and boolean to String using wrapper class 
          String s1=Integer.toString(123);
          String s2=Double.toString(3.14);
          String s3=Character.toString('@');
          String s4=Boolean.toString(false);
          System.out.println();
          System.out.println(s1+s2+s3+s4);

          // Now if we want to convert a String to a primitive datatype you parse it. 

          int r=Integer.parseInt("123");
          double d1=Double.parseDouble("3.14)");
          boolean b1=Boolean.parseBoolean("true");


    }
}
