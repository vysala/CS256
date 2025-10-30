package ArraysOfObjects;

import java.util.Arrays;

public class ArraystoString {
    public static void main(String[] args) {
        // Integer array
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer array: " + Arrays.toString(intArray));

        // String array
        String[] stringArray = {"apple", "banana", "cherry"};
        System.out.println("String array: " + Arrays.toString(stringArray));

        // Double array
        double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double array: " + Arrays.toString(doubleArray));

        // Boolean array
        boolean[] booleanArray = {true, false, true};
        System.out.println("Boolean array: " + Arrays.toString(booleanArray));

        // Character array
        char[] charArray = {'a', 'b', 'c'};
        System.out.println("Character array: " + Arrays.toString(charArray));

        // Array of custom objects (assuming a meaningful toString() method in the custom class)
        // Also note that name is a private variable in Custom class, so you can only initialize values to the name attribute through the defined constructor  
       Custom[] customObject = {new Custom("Obj1"), new Custom("Obj2")};
        /*Custom[] customObject = new Custom[2];
        customObject[0]=new Custom("Janice");
        customObject[1]=new Custom("Lincy");*/
        System.out.println("Custom object array: " + Arrays.toString(customObject));
    }
}

class Custom {
    private String name;

    public String getName() {
        return name;
    }

    public Custom(String name) {
        this.name = name;
    }

    @Override
   public String toString() {
        //return "CustomObject{" + "name='" + name + '\'' + '}';
        return name;
    }
}