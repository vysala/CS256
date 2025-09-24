package MutableObjects;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Scanner;

/*  Enter coordinates of Point (x y): 15 25
Enter Rectangle 1 (x y width height): 10 20 10 5
Enter Rectangle 2 (x y width height): 12 22 8 6
 * 
 */
public class PointRectangleASCIIVisualization {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Point
        System.out.print("Enter coordinates of Point (x y): ");
        int px = sc.nextInt();
        int py = sc.nextInt();
        Point p = new Point(px, py);

        // Input for Rectangle 1
        System.out.print("Enter Rectangle 1 (x y width height): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int w1 = sc.nextInt();
        int h1 = sc.nextInt();
        Rectangle rect1 = new Rectangle(x1, y1, w1, h1);

        // Input for Rectangle 2
        System.out.print("Enter Rectangle 2 (x y width height): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int w2 = sc.nextInt();
        int h2 = sc.nextInt();
        Rectangle rect2 = new Rectangle(x2, y2, w2, h2);

        // Display objects
        System.out.println("\nPoint: " + p);
        System.out.println("Rectangle 1: " + rect1);
        System.out.println("Rectangle 2: " + rect2);

        // Check if point lies inside rect1
        System.out.println("\nDoes Rectangle 1 contain the point? " + rect1.contains(p));

        // Check if rectangles intersect
        System.out.println("Do Rectangle 1 and Rectangle 2 intersect? " + rect1.intersects(rect2));

        // Visualization on a grid (scaled down to fit)
        System.out.println("\n--- ASCII Visualization ---");
        drawGrid(p, rect1, rect2);   // drawGrid() to create a text-based (ASCII) visualization of the point and rectangles on the console.

        sc.close();
    
    }

    // Draws a grid and marks rectangles and point
    public static void drawGrid(Point p, Rectangle r1, Rectangle r2) {
        //  Determine grid size 
        //It finds the maximum x and y values needed to fit both rectangles. This decides how large the grid should be.

        int maxX = Math.max(r1.x + r1.width, r2.x + r2.width);
        int maxY = Math.max(r1.y + r1.height, r2.y + r2.height);
// Loop through grid cells
// It uses two nested loops (for y, for x) to check every coordinate on the grid.
        for (int y = 0; y <= maxY + 2; y++) {
            for (int x = 0; x <= maxX + 2; x++) {
                // If the position equals the point (p.x, p.y), print *.
                if (p.x == x && p.y == y) {
                    System.out.print("*"); // point
                    //If the position is inside both rectangles, print @.
                } else if (r1.contains(x, y) && r2.contains(x, y)) {
                    System.out.print("@"); // overlap area
                } else if (r1.contains(x, y)) {
                    System.out.print("#"); // rectangle 1
                } else if (r2.contains(x, y)) {
                    System.out.print("+"); // rectangle 2
                } else {
                    System.out.print("."); // empty space
                }
            }
            System.out.println();
        }
    }
}



/* Explanation 

r1.x + r1.width

r1.x → the x-coordinate of the top-left corner of Rectangle 1.

r1.width → the width of Rectangle 1.

Adding them gives the x-coordinate of the right edge of Rectangle 1.

r2.x + r2.width  Similarly, this is the x-coordinate of the right edge of Rectangle 2.

Math.max(...)  => Takes the larger of the two right-edge coordinates.

This ensures the grid is wide enough to include both rectangles fully.



*/