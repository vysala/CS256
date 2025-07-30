/* In Java, byte, short, and long are primitive integer data types that differ primarily in their size (number of bits) and, consequently, the range of values they can store. 
  1 byte =8 bits, short=16 bits(2 bytes), int=32 bits(4 bytes) ,  float =32 bits (4 bytes), double and  long=64 bits(8 bytes). Long can be used to store large integer value.

In programming, both float and double are used to represent decimal numbers. A double will use 8 bytes or 64 bits of memory while a float uses only 4 bytes or 32 bits. 
*/

public class DataTypesDemo {

	public static void main(String[] args) {
		
		//Numeric data types

		
		int a=100, b=200;
		System.out.println(a+b);  // 300
		
		byte by=100;
		System.out.println(by); //100

		short sh=250;
		System.out.println(sh); //250

		long l=1234567;
		System.out.println(l);//1234567

		l=13456754445L; // if you have more than 10 digits in long data type you should add Literal (L / l)
		System.out.println(l); //13456754445

		//Decimal numbers - float , double
		float price=150.55F; // Here literal has to use F/f
		System.out.println(price); //150.55

		double d=150.555;
		System.out.println(d); //150.555

		//int --> decimal
		int x=(int)10.5; // type casting
		System.out.println(x); //10 here we loss the decimal part

		//decimal --> int
		double dbl=100;
		System.out.println(dbl); //100.0

		//character -- char
		char ch='A';
		System.out.println("The grade of the student is:"+ch); //A

		char n='5';
		System.out.println(n); //5

		//String
		String s="welcome";
		System.out.println(s); //welcome

		String n1="123456";
		System.out.println(n1);

		//boolean
		//boolean bo=true;
		boolean bo=false;
		System.out.println(bo);

		String st="true";
		System.out.println(st);
		}

		

}
