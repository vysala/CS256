package LoopsDemo;
public class WhileLoopUsecase {

	public static void main(String[] args) {
		
		int i=1;
		while(true) // I don't know how many times this loop should execute , so I put true here. But to break from that loop I used a condition. 
		{
			System.out.println(i);
			i++;
			
			if(i==5)
			{
				break;
			}
		}

	}

}
