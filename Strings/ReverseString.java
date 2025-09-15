package StringsInJava;

public class ReverseString {

	public static void main(String[] args) {
		
		//Method1 - length()  charAt()
		
		/*String s="welcome";
		String rev="";
				
		for(int i=s.length()-1; i>=0  ;i--)
		{
			//rev=rev+s.charAt(i);
			 // rev=rev+s[i]; //  this will not work as it is a String.
			
		}
		System.out.println("Reverse string:"+ rev); //emoclew
		*/
		
		//Method2: By converting string to char type array  toCharArray()
		
		/*String s="welcome";
		String rev="";
		
		char a[]=s.toCharArray(); // converting string to char type of array
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse string:"+ rev);
		
		*/
		
		//Method3: using StringBuffer
		
		//StringBuffer s=new StringBuffer("welcome");
		//System.out.println("Reverse string is:"+ s.reverse()); //emoclew
		
		
		//Method4 : using StringBuilder
		StringBuilder s=new StringBuilder("welcome");
		//String rev=s.reverse().toString();  // to get the result in String format
		
		System.out.println("Reverse string:"+ s.reverse()); //emoclew
		//System.out.println("Reverse string in string format:"+ rev);
		
		
	}

}
