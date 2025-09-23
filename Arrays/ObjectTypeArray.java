package Arrays;

public class ObjectTypeArray {

	public static void main(String[] args) {
		
		Object[] a = new Object[5];
      
        a[0] = "Hello";      // String
        a[1] = 123;          // Integer
        a[2] = 45.67;        // Double
        a[3] = true;         // Boolean
        a[4] = 'A';          // Character

       //access specific value from array
       System.out.println(a[2]); //45.67
       System.out.println(a[2].getClass().getSimpleName()); //Double type of object
              
       System.out.println("Reading data from the array using for loop:");
        for (int i = 0; i < a.length; i++) {
             System.out.println(a[i]);
        }
		
		System.out.println("Reading data from the Object array using for-each loop:");
        for (Object element : a) {
           System.out.println(element);
        }
	}
}
