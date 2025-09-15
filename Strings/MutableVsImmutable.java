package StringsInJava;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		//StringBuilder - Mutable / we can change/modify the objects
		
		/*StringBuilder sb=new StringBuilder("Hello");
		System.out.println("Original value: "+sb); //Hello
		sb.append(" world"); 
		System.out.println("After modification:"+ sb); //Hello world */
		
		
		//StringBuffer - Mutable / we can change/modify the objects
		/*StringBuffer sb=new StringBuffer("Hello");
		System.out.println("Original value: "+sb); //Hello
		sb.append(" world"); 
		System.out.println("After modification:"+ sb); //Hello world*/
		
		
		
		//String - Immutable / we cannot change/modify the objects
		/*String sb=new String("Hello");  //String sb="Hello";
		System.out.println("Original value: "+sb); //Hello
		sb.concat(" world"); 
		System.out.println("After modification:"+ sb); //Hello  */

		//String concatinated =sb.concat( "world");
		//System.out.println(concatinated);

		//System.out.println(sb==concatinated);
	}

}
