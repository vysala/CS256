package ScannerDemo;

import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter your name");
    String name=in.nextLine();
    System.out.println("Enter your age");
    int age=in.nextInt();
    System.out.println("Enter your salary");
    double salary=in.nextDouble();
    System.out.println(name + " " +age+" " +salary);

}


}
