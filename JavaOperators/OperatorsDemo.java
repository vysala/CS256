package JavaOperators;
public class OperatorsDemo {

	public static void main(String[] args) {
		
		//Arithmetic operators   +  - * /  %
		
		int a=20, b=10;

		
		
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(a-b));
		System.out.println("Product of Sum of a and b is:"+(a*b));
		System.out.println("Division of a and b is:"+(a/b));
		System.out.println("Modulo division of a and b is:"+(a%b)); 
		
		//Relational or comparison operators   ==  !=  <  >   <=  >=
		// returns boolean value  - true/false
		
		/*b=20;
		System.out.println("Is a equal to b " + (a==b));  //true
		System.out.println(a!=b); //false
		
		a=5;
		System.out.println(a<b); //true
		System.out.println(a>b); //false
		
		a=10;
		b=10;
		System.out.println(a<=b); //true
		System.out.println(a>=b); //true */
		
		//Logical operators - && ||  !
		// returns boolean value - true/false
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);  //false
		System.out.println(x || y); //true 
		
		System.out.println(!x); // false
		System.out.println(!y);  //true
		
		boolean b1=10>20;
		System.out.println(b1); //false
		
		boolean b2=20>10;
		System.out.println(b2);  //true
		
		System.out.println(b1 && b2);  //false
		System.out.println(b1 || b2);  //true
		
		System.out.println((10<20) && (20>10));  //true
		System.out.println((10<20) || (20>10));  //true
		
		System.out.println(!(10<20)); //false
		
		
		int bint=20;
						
		System.out.println(bint < 5 &&  bint < 10); //false
		System.out.println(bint < 5 || bint < 4);  //false
		System.out.println(!(bint < 5 && bint < 10));  //true
		

	}

}
