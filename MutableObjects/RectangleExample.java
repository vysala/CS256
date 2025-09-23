package MutableObjects;
import java.awt.Rectangle;
import java.awt.Point;
/* Point → represents a single coordinate (x, y).
Rectangle → represents a rectangular area with (x, y, width, height).
They are often used together for graphics, GUI layout, and collision/boundary checking.
 * 
 */

public class RectangleExample {
 public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20, 100, 50); // x=10, y=20, w=100, h=50
        Point p = new Point(50, 40);

        System.out.println("Rectangle: " + rect);
        System.out.println("Does rectangle contain point " + p + "? " + rect.contains(p));

        rect.translate(20, 10); // move by (20,10)
        System.out.println("Rectangle after moving: " + rect);

        Rectangle rect2 = new Rectangle(30, 25, 50, 30);
        System.out.println("Does rect intersect rect2? " + rect.intersects(rect2));
    }
}
