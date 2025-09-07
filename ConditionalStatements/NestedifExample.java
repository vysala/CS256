package ConditionalStatements;

package ConditionalStatements;
/* You are using two independent if conditions, and one of them has an else. */
public class IndependentifExample
{
	public static void main(String[] args) {
		int num=0;
		if(num>0){
		    System.out.println("The number is positive");
		}
		 if(num%2==0){
		     System.out.println("The number is divisible by 2");
		 }
		  else{
		      System.out.print("The number is not divisible by 2");
		   }
	}
}
