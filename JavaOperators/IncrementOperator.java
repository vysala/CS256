package JavaOperators;
/*a++ and ++a both increase a by 1. The difference is when the increment happens relative to using the value. 
   a++ is called post increment and ++a is called pre-increment.
*/
public class IncrementOperator {

	    //a++;    // this is post increment
		//++a;   // this is pre increment

	public static void main(String[] args) {     // Showing each case seperately
		
		int a= 10;
		
		//Case 1 
		/*a=a+1;
		System.out.println(a); //11  */
		
		
		//Case 2 : Because ++ is after a, this is post-increment. ie, use the current value first, then increment.
		  /*int res=a++;
		 System.out.println(res);  //10 */
		
		//Case 3 : Here, ++ comes before a, so this is pre-increment. Increment first, then use the value.
		  // int res=++a;   
		   //System.out.println(res); //11 
		
		//Case4 - there is difference
		System.out.println(a++);  //10 
		System.out.println(++a);  //12  


		//Both a++ and ++a ultimately increase a by 1. The difference becomes visible when you do something like int res=a++;
		
		
	}

}
