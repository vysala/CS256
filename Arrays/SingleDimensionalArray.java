package Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		//Approach1
		
		/*int a[]=new int[5];  //declaration
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		*/
		
		//Approach2
		int a[]= {10,20,30,40,50};
		
		//size of an array
		System.out.println(a.length);  //5
		
		//access specific value from array
		System.out.println(a[2]);   // here 2 is index of the element
		
		
		// read data from array using normal for loop
		
		/*for(int i=0;i<a.length;i++)    // i<=4  or i<5  or i<a.length  or  i<=a.length-1
  		{
			System.out.println(a[i]);
		}
		*/
		
		//read data from array using for-each loop/ enhanced for loop
		
		for(int n:a)
		{
			System.out.println(n);
		}
			
		
	}

}







