package Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//Appraoch1
		
		int a[][]=new int [3][2];  //declaration
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		
		
		//Approach2
		
		/*int a[][]= {  
				{100,200}, 
				{300,400}, 
				{500,600} 
				}; */
		
	 //Size of an array
		System.out.println(a.length);  //3  return number of rows
		System.out.println(a[0].length); //2  return number of columns in 0 row
		
	 // access specific value from 2d array
		System.out.println(a[2][1]); //600
		
	// read all the values from 2d array using normal for loop
		
		/*for(int r=0;r<a.length;r++)
		{
			//System.out.println("row no:"+r); //0
			 for(int c=0;c<a[r].length;c++)
			 {
				 System.out.print(a[r][c]+"  ");
			 }
			System.out.println();
		}
		*/
		
	//read all the values using for..each loop
		
	 /* for(int x[]:a)
		{
			for(int num:x)
			{
				System.out.print(num+"\t");
			}
			System.out.println();
		}
		*/
		
		
	}

}






