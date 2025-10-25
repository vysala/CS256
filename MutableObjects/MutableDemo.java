package Recording;
import java.awt.*;
public class MutableDemo {

    public static void printPoint(Point point) {
    System.out.println("(" + point.x + ", " + point.y + ")");
}

/*public static double distance(Point p1, Point p2) {
    int dx = p2.x - p1.x;
    int dy = p2.y - p1.y;
    return Math.sqrt(dx * dx + dy * dy);
}*/



    public static void main(String[] args) {
        Point blank=new Point(3,4);
        Point p1=new Point(0,0);
        Point p2=new Point(3,4);
        //System.out.println(blank.getX());
        //System.out.println(blank.x);
        //System.out.println(blank.getY());
        printPoint(blank);
       //double result=distance(p1,p2);
       // System.out.println(result);
       System.out.println(p1.distance(p2));
       System.out.println(blank);
       p1.setLocation(6,7);
       System.out.println(p1.getX());
       System.out.println(p1.getY());
       p2.translate(2,2);
       System.out.println(p2.getX());
       System.out.println(p2.getY());
    }

}
