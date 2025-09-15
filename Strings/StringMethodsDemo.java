package StringsInJava;
/* */
import java.util.*;

public class StringMethodsDemo {

    public static void main(String[] args) {
        // 1. length()
        String str = "Hello, World!";
        int len = str.length();
        System.out.println("Length of string: " + len); // 13

        // 2. charAt(int index)
        char ch = str.charAt(1);
        System.out.println("Character at index 1: " + ch); // 'e'

        // 3. substring(int beginIndex)
        String subStr1 = str.substring(7);
        System.out.println("Substring from index 7: " + subStr1); // "World!"

        // 4. substring(int beginIndex, int endIndex)
        String subStr2 = str.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + subStr2); // "Hello"

        // 5. contains(CharSequence s)
        boolean contains = str.contains("W");
        System.out.println("Contains 'World': " + contains); // true

        // 6. equals(Object anObject)
        String str1 = "Hello";
        String str2 = "Hello";
        boolean isEqual = str1.equals(str2);
        System.out.println("Equals 'Hello' and 'Hello': " + isEqual); // true

        // 7. equalsIgnoreCase(String anotherString)
        String str3 = "hello";
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str3);
        System.out.println("EqualsIgnoreCase 'Hello' and 'hello': " + isEqualIgnoreCase); // true

        // 8. toLowerCase()
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr); // "hello, world!"

        // 9. toUpperCase()
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr); // "HELLO, WORLD!"

        // 10. trim()
        String str4 = "  Hello, World!  ";
        String trimmedStr = str4.trim();
        System.out.println("Trimmed string: " + trimmedStr); // "Hello, World!"

        // 11. replace(char oldChar, char newChar)
        String replacedStr1 = str.replace('o', 'a');
        System.out.println("Replaced 'o' with 'a': " + replacedStr1); // "Hella, Warld!"

        // 12. replace(CharSequence target, CharSequence replacement)
        String replacedStr2 = str.replace("World", "Java");
        System.out.println("Replaced 'World' with 'Java': " + replacedStr2); // "Hello, Java!"

        // 13. split(String regex)
        String[] words = str.split(", ");
        System.out.println("Split by ', ':");
        for (String word : words) {
            System.out.println(word); // "Hello" "World!"
        }

        // 14. indexOf(int ch)
        int index1 = str.indexOf('o');
        System.out.println("Index of 'o': " + index1); // 4

        // 15. indexOf(String str)
        int index2 = str.indexOf("World");
        System.out.println("Index of 'World': " + index2); // 7

        // 16. startsWith(String prefix)
        boolean starts = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + starts); // true

        // 17. endsWith(String suffix)
        boolean ends = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + ends); // true

        // 18. isEmpty()
        String str5 = "";
        boolean empty = str5.isEmpty();
        System.out.println("Is empty: " + empty); // true

        // 19. toCharArray()
        char[] chars = str.toCharArray();
        System.out.println("To char array:");

        System.out.print(Arrays.toString(chars));
        /*for (char c : chars) {
            System.out.println(c); // 'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!'
        }*/

        // 20. valueOf(Object obj)
        // In Java, the String.valueOf() method is a static method that converts different types of values (like numbers, booleans, characters, objects, arrays, etc.) 
        //into their string representation.

        int num = 123;
        String strValue = String.valueOf(num);
        System.out.println("Value of 123: " + strValue); // "123"
        

        
    }
}
