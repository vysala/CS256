package ArraysOfObjects;
// A program to understand that a string type variable in Java is not iterable. So don't write an enhanced for loop directly.

public class foreachCases {
 public static void main(String[] args) {
    String word="java";
    /*for (char element : word) {  // this will not compile
           // A for-each loop (for (type var : collection)) only works on arrays or Iterable objects 
           //(like ArrayList, Set, etc.).
          //But a String in Java is not an Iterable.
          // That means you can’t write for (char element : str) directly.

    } */ 

    

for (int i=0; i< word.length(); i++)  // normal loop can perform indexing.
{
if(i>0) 
	System.out.print(",");

System.out.print( word.charAt(i) );
}

 
 }
}

