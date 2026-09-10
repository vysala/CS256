package ScannerDemo;
import java.util.Random;
public class RandomDemo {
public static void main(String[] args) {
    int seed=40;
    Random random=new Random(seed);
    int x=random.nextInt(10)+1;
    double y=random.nextDouble();
    boolean z=random.nextBoolean();
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
}
}
