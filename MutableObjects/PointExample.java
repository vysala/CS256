package MutableObjects;
import java.awt.Point;

public class PointExample {
public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(30, 40);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        p1.translate(5, -5);  // relative shift by (5, -5)
        System.out.println("Point 1 after translate: " + p1.x + " "+ p1.y);

        p1.setLocation(10,20);  // absolute shift
        System.out.println("Point 1 after translate: " + p1.getX() + " "+ p1.getY());

        double dist = p1.distance(p2);
        System.out.println("Distance between p1 and p2: " + dist);
    }
}
