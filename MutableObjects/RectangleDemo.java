package MutableObjects;
import java.awt.Rectangle;
public class RectangleDemo {
     public static void main(String[] args) {
        // Create a Rectangle at (5, 10) with width 20 and height 30
        Rectangle rect = new Rectangle(5, 10, 20, 30);

        // Access attributes using dot operator
        System.out.println("x: " + rect.x); // Left side
        System.out.println("y: " + rect.y);  // Top side
        System.out.println("width: " + rect.width); // Right side (x + width)  , that is how far the rectangle extends horizontally, or how wide the rectangle is 
        System.out.println("height: " + rect.height); // how far the rectangle extends vertically

        // Modify them
        rect.x = 15;
        rect.y = 25;
        rect.width = 40;
        rect.height = 50;

        System.out.println("Updated Rectangle: (" + rect.x + ", " + rect.y +
                           ", " + rect.width + ", " + rect.height + ")");

                           
    }
}


   