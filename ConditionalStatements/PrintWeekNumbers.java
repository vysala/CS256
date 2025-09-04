package ConditionalStatements;
public class PrintWeekNumbers {

	public static void main(String[] args) {
		
		String weekname="sunday";
		
		if(weekname=="sunday")
		{
			System.out.println(1);
		}
		else if(weekname=="monday")
		{
			System.out.println(2);
		}
		else if(weekname=="tuesday")
		{
			System.out.println(3);
		}
		else if(weekname=="wednesday")
		{
			System.out.println(4);
		}
		else if(weekname=="thursday")
		{
			System.out.println(5);
		}
		else if(weekname=="friday")
		{
			System.out.println(6);
		}
		else if(weekname=="saturday")
		{
			System.out.println(7);
		}
		else
		{
			System.out.println("invalid week name");
		}
	}

}





