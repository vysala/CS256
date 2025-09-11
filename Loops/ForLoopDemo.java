package LoopsDemo;
public class ForLoopDemo {

	public static void main(String[] args) {
		
		//Example1: 1.....10
		
		/*for(int i=1;i<=10;i++)
		{
			System.out.print(i + " ");
		} 
		System.out.println(); */

		//Example2 : even numbers upto 10
		
		//method1
		/*for(int i=2;i<=10;i+=2)
		{
			System.out.print(i+ " ");
		}
		System.out.println(); */
		
		//method2
		/*for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
			System.out.print(i + " ");
			}
		}
	    System.out.println(); */
		
		//Example3: 10 9 8 .....1
		
		/* for(int i=10;i>=1;i--)
		{
			System.out.print(i + " ");
		}
		System.out.println(); */
		
		
		//The trailing semicolon (;) makes the for loop do nothing during its iterations. When the loop ends,
		// the variable i has already been incremented to 6, which is why that value gets printed.
		/*int i;
		for(i=1;i<=5;i++); //2 3 4 5 6   That trailing semicolon after your for loop means the loop’s body is empty.After the loop finishes, i will be 6.
			
		System.out.println(i);  //6  */
				
	}

}
