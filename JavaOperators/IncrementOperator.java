package JavaOperators;

public class IncrementOperator {

	    //a++;    // this is post increment
		//++a;   // this is pre increment

	public static void main(String[] args) {     // Showing each case seperately
		
		int a= 10;
		
		//Case 1 
		/*a=a+1;
		System.out.println(a); //11  */
		
		
		//Case 2
		  /*int res=a++;
		 System.out.println(res);  //10 */
		
		//Case 3
		  // int res=++a;
		   //System.out.println(res); //11 
		
		//Case4 - there is difference
		System.out.println(a++);  //10 
		System.out.println(++a);  //12  
		
		
		
	}

}
