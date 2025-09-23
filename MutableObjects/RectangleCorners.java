package MutableObjects;

//get all four corners of a Rectangle object in AWT.
import java.awt.Rectangle;

public class RectangleCorners {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(50, 100, 200, 80);

        // Top-left corner
        int x1 = rect.x;
        int y1 = rect.y;

        // Top-right corner
        int x2 = rect.x + rect.width;
        int y2 = rect.y;

        // Bottom-left corner
        int x3 = rect.x;
        int y3 = rect.y + rect.height;

        // Bottom-right corner
        int x4 = rect.x + rect.width;
        int y4 = rect.y + rect.height;

        System.out.println("Top-left: (" + x1 + ", " + y1 + ")");
        System.out.println("Top-right: (" + x2 + ", " + y2 + ")");
        System.out.println("Bottom-left: (" + x3 + ", " + y3 + ")");
        System.out.println("Bottom-right: (" + x4 + ", " + y4 + ")");
    }
}
