package VRecord;
import java.util.*;
//import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        //ArrayList myList=new ArrayList<>(); // Generic 
        List myList=new ArrayList(); // Generic 

        //ArrayList<String> myList=new ArrayList<String>();
        // adding elements to the arrayList
        myList.add(100); // Integer
        myList.add(20.0); // Double
        myList.add("Welcome"); // String 
        myList.add('A'); // Char
        myList.add(true); // Boolean
        myList.add(100);
        myList.add(null);
    
        // size of the arrayList
        System.out.println("The lenght of the arrylist " + myList.size());

        //print the list elements

        System.out.println("The array elements are " + myList);

        // Remove the array elements 

        myList.remove(2);
        System.out.println("After removing the element at index 2 " + myList);

        // inserting 
        myList.add(2,"Java");
        System.out.println("After inserting  element at index 2 " + myList);

        // modification
        myList.set(2,"Python");
         System.out.println("After modifying the ArrayList " + myList);

         // retrieve using get method
         System.out.println("Accesing fourth element from the list: " +myList.get(3));

         // how to read elements from this arraylist using a for loop

         System.out.println("Accessing elements using a normal for loop");
         for(int i=0;i<myList.size();i++){
              System.out.print(myList.get(i) + " ");
         }

         System.out.println();
          // enhanced for loop
         System.out.println("After using a enhanced for loop ");

         for( Object element: myList){
            System.out.print(element + " ");

         }

         // using iterator to read the array elements 

        Iterator iterate=myList.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }


        // remove specific group of elements 

        ArrayList myList2=new ArrayList<>();
        myList2.add(100);
        myList2.add(20.0);

        myList.removeAll(myList2);
        System.out.println("The array list after removing those elements are " + myList);

        // clear()

        myList.clear();
         System.out.println("The array list after removing all elements" + myList);


        



        
        
    }


}
