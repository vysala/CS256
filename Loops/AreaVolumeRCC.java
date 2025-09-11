/* The following program is designed to find the area of a rectangle, the area of
a circle, or the volume of a cylinder. However, 
(a) the statements are in the incorrect order; 
(b) the method calls are incorrect; 
(c) the logical expression in the while loop is incorrect; and 
(d) method definitions are incorrect. 
Rewrite the program so that it works correctly. Your program must be properly indented. (Note that the program is menu driven and
allows the user to run the program as long as the user wishes.) */
/*  Incorrect program

import java.util.*;
public class ProgExercise2 {

 
static Scanner console = new Scanner(System.in);
public static void main(String[] args)
{
double radius;
double height;
System.out.println("This program can calculate " + "the area of a rectangle, the area " + "of a circle, or volume of a cylinder.");
System.out.println("To run the program enter: ");
System.out.println("1: To find the area of rectangle.");
System.out.println("2: To find the area of a circle.");
System.out.println("3: To find the volume of a cylinder.");
System.out.println("-1: To terminate the program.");
choice = console.nextInt();
System.out.println();
int choice;
while (choice ==-1)
{
{
switch (choice)
}
System.out.println("To run the program enter: ");
System.out.println("2: To find the area of a circle.");
System.out.println("1: To find the area of rectangle.");
System.out.println("3: To find the volume of a cylinder.");
System.out.println("-1: To terminate the program.");
choice = console.nextInt();
System.out.println();
case 1:
System.out.print("Enter the radius of the base and "
+ "the height of the cylinder: ");
radius = console.nextDouble();
height = console.nextDouble();
System.out.println();
System.out.printf("Area = %.2f%n",
circle(length, height));
break;
case 3:
double length, width;
System.out.print("Enter the radius of the circle: ");
radius = console.nextDouble();
System.out.println();
System.out.printf("Area = %.2f%n", rectangle(radius));
break;
case 2:
System.out.print("Enter the length and the width "
+ "of the rectangle: ");
length = console.nextDouble();
width = console.nextDouble();
System.out.println();
System.out.printf("Volume = %.2f%n",
cylinder(radius, height));
break;
default:
System.out.println("Invalid choice!");
}

}
public static double rectangle(double l, double w)
{
return l * r;
}
public static double circle(double r)
{
return Math.PI * r * w;
}
public static double cylinder(double bR, double h)
{
return Math.PI * bR * bR * l;
}
}

*/
package LoopsDemo;
import java.util.*;
public class AreaVolumeRCC
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        double radius;
        double height;
        double length, width;

        int choice;

        System.out.println("This program can calculate "
                         + "the area of a rectangle, the area "
                         + "of a circle, or volume of a cylinder.");
        System.out.println("To run the program enter: ");
        System.out.println("1: To find the area of rectangle.");
        System.out.println("2: To find the area of a circle.");
        System.out.println("3: To find the volume of a cylinder.");
        System.out.println("-1: To terminate the program.");
        choice = console.nextInt();
        System.out.println();


        while (choice != -1)
        {
			switch (choice)
            {
            case 1:
                System.out.print("Enter the length and the width "
			                  + "of the rectangle: ");
			    length = console.nextDouble();
			    width = console.nextDouble();
                System.out.println();

                System.out.printf("Area = %.2f%n",
                                  rectangle(length, width));
                break;

            case 2:
                System.out.print("Enter the radius of the circle: ");
                radius = console.nextDouble();
                System.out.println();

                System.out.printf("Area = %.2f%n", circle(radius));
                break;

            case 3:
                System.out.print("Enter the radius of the base and "
                               + "the height of the cylinder: ");
                radius = console.nextDouble();
                height = console.nextDouble();
                System.out.println();

                System.out.printf("Volume = %.2f%n",
                                  cylinder(radius, height));
                break;
            default:
                System.out.println("Invalid choice!");
            }

            System.out.println("To run the program enter: ");
            System.out.println("1: To find the area of rectangle.");
            System.out.println("2: To find the area of a circle.");
            System.out.println("3: To find the volume of a cylinder.");
            System.out.println("-1: To terminate the program.");
            choice = console.nextInt();
            System.out.println();
        }

    }

    public static double rectangle(double l, double w)
    {
        return l * w;
    }

    public static double circle(double r)
    {
        return Math.PI * r * r;
    }

    public static double cylinder(double bR, double h)
    {
        return Math.PI * bR * bR * h;
    }
}
