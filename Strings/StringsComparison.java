package StringsInJava;


public class StringsComparison {

	public static void main(String[] args) {
		
		// String s1 = "welcome"; // creates a string in the String Pool
        // String s2 = new String("welcome"); // creates a string in the Heap memory

        // '==' is used for comparing objects/references (memory locations)
        // 'equals()' is used for comparing the actual content (values) of strings

		
        //Case 1: s1 and s2 point to the same object in the String Pool
        
       /*String s1 = "welcome";
        String s2 = "welcome";
        
        System.out.println(s1 == s2); // true, as both s1 and s2 refer to the same object in the String Pool
        System.out.println(s1.equals(s2)); // true, as the content of both strings is the same
        */

        // Case 2: s1 and s2 point to different objects in Heap memory
        
        /*String s1 = new String("welcome");
        String s2 = new String("welcome");
        
        System.out.println(s1 == s2); // false, as s1 and s2 refer to different objects in the Heap
        System.out.println(s1.equals(s2)); // true, as the content of both strings is the same
        */

        // Case 3: s1 and s2 point to different objects in the String Pool because their values are different
        
      /*  String s1 = "welcome";
        String s2 = "java";
        
        System.out.println(s1 == s2); // false, as s1 and s2 refer to different objects due to different content
        System.out.println(s1.equals(s2)); // false, as the content of the strings is different
        */

        // Case 4: s1 and s2 point to different objects in Heap memory with different content
        /*
        String s1 = new String("welcome");
        String s2 = new String("java");
        
        System.out.println(s1 == s2); // false, as s1 and s2 refer to different objects in the Heap
        System.out.println(s1.equals(s2)); // false, as the content of the strings is different
        */

        // Case 5: s1 and s2 point to the same object in the String Pool using intern()
        
        /*String s1 = new String("welcome").intern(); // intern() moves the string to the String Pool
        String s2 = new String("welcome").intern(); // s2 points to the same object as s1 in the String Pool
        
        System.out.println(s1 == s2); // true, as both s1 and s2 refer to the same object in the String Pool
        System.out.println(s1.equals(s2)); // true, as the content of both strings is the same
        */

        // Case 6: s1 is in the String Pool, s2 is in the Heap memory
        /*
        String s1 = "welcome";  // s1 is created in the String Pool
        String s2 = new String("welcome"); // s2 is created in the Heap memory
        
        System.out.println(s1 == s2); // false, as s1 and s2 refer to different objects (one in the Pool, one in the Heap)
        System.out.println(s1.equals(s2)); // true, as the content of both strings is the same
        */

        // Case 7: s1 and s2 are references to the same object in the String Pool
        /*
        String s1 = "welcome";
        String s2 = s1;
        
        System.out.println(s1 == s2); // true, as s1 and s2 are references to the same object
        System.out.println(s1.equals(s2)); // true, as the content of both strings is the same
        */

        // Case 8: s1 and s2 are references to the same object in the Heap memory
      /*   String s1 = new String("welcome");
        String s2 = s1; // s2 is assigned the reference of s1
        
        System.out.println(s1 == s2); // true, as s1 and s2 refer to the same object in the Heap
        System.out.println(s1.equals(s2)); // true, as the content of both strings is the same
		*/
	}

}
