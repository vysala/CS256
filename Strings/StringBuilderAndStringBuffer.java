package StringsInJava;

public class StringBuilderAndStringBuffer {

	public static void main(String[] args) {
		
		//String s=new String("welcome");
		//String s="welcome";
		
		//StringBuffer
		//StringBuffer s=new StringBuffer("Hello");
		//StringBuffer s="welcome"; // not possible
		
		StringBuilder s=new StringBuilder("Hello");
		//StringBuilder s="welcome";  // not possible
		
		
		//1) Append()
		s.append(" world");
		System.out.println(s);//Hello world
		
		
		//2) insert()
		s.insert(5,",");  // here 5 is index/position
		System.out.println(s); //Hello, world
		
		//3) replace()
		s.replace(5, 6, "!");
	
		System.out.println(s); //Hello! world

		//4) delete() 
		s.delete(5, 6);
		System.out.println(s); //Hello world
		
		//5) reverse()
		s.reverse();
		System.out.println(s);  //dlrow olleH

		
		
		
		
		
		
		
		
		
		

	}

}
