
/*  The following formula gives the distance between two points (x1, y1) and
(x2, y2) in the Cartesian plane:    sqrt((x2-x1)2 +(y2-y1)2)

Given the center and a point on a circle, you can use this formula to find the
radius of the circle. Write a program that prompts the user to enter the
center and a point on the circle. The program should then output the circle’s
radius, diameter, circumference, and area. Your program must have at least
the following methods:
a.distance: This method takes as its parameters four numbers that represent two
points in the plane and returns the distance between them.

b.radius: This method takes as its parameters four numbers that represent the
center and a point on the circle, calls the method distance to find the
radius of the circle, and returns the circle’s radius.

c.circumference: This method takes as its parameter a number that represents
the radius of the circle and returns the circle’s circumference. (If r is the
radius, the circumference is 2pr.) "p is the pi value"

d.area: This method takes as its parameter a number that represents the radius of the
circle and returns the circle’s area. (If r is the radius, the area is pr2.)
e.Assume that p = 3.1416. 

  Since the radius of a circle is the distance from its center to any point on the circle, this radius method is simply reusing the distance() logic. 

*/  



package FunctionsTopic;

import java.util.*;

public class ProgExercise4
{

    static final double PI = 3.1416;

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {

    double x1, x2, y1, y2;
    double circleRadius;

    System.out.print("Enter the x and y coordinates of the center of the circle: "); //(x1,y1) center of the circle.
    x1 = console.nextDouble();
    y1 = console.nextDouble();
    System.out.println();

    System.out.print("Enter the x and y coordinates of a point on the circle: ");
    x2 = console.nextDouble();
    y2 = console.nextDouble();
    System.out.println();

    circleRadius = radius(x1, y1, x2, y2);   // 

    System.out.printf("Radius =        %.2f %n", circleRadius);
    System.out.printf("Diameter =      %.2f %n", (2 * circleRadius));
    System.out.printf("Circumference = %.2f %n", circumference(circleRadius));
    System.out.printf("Area =          %.2f %n", area(circleRadius));
}

public static double distance(double firstX, double firstY,
                                double secondX, double secondY)
{
    return Math.sqrt(Math.pow((secondX - firstX),2)
            + Math.pow((secondY - firstY), 2));
}

public static double radius(double firstX, double firstY,
                            double secondX, double secondY)
{
    return distance(firstX,firstY,secondX,secondY);
}

public static double circumference(double cRadius)
{
    return (2 * PI * cRadius);
}

public static double area(double cRadius)
{
    return (PI * Math.pow(cRadius, 2));
}
}

