package ScannerDemo;

import java.util.Scanner;

public class SDemo1 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("What is your first name?");
String firstName = in.nextLine();
System.out.println("What is your last name?");
String lastName = in.nextLine();
System.out.println("Name: " + lastName + ", " + firstName);

}
}
