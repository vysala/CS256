/*

Write a program that prompts the user to input a sequence of characters
and outputs the number of vowels. ( Write a method isVowel that has one parameter.

public static boolean isVowel(char ch)
{ }  You need to use switch case to check if it is vowel.
 */



 
package LoopsDemo;

import java.util.Scanner;

public class CountVowelsString {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
    String inputLine;

    int count = 0;

    System.out.print("Enter characters in a line: ");
    inputLine = console.nextLine();
    System.out.println();

    for (int i = 0; i < inputLine.length(); i++)
        if (isVowel(inputLine.charAt(i)))
            count++;

    System.out.println();
    System.out.println("There are " + count + " vowel in the input line");
}

    public static boolean isVowel(char ch)
    {
        switch (ch)
        {
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            return true;
        default:
            return false;
        }
    }

}
