package StringsInJava;

public class ValueOfExample {
    public static void main(String[] args) {
        int num = 100;
        double d = 55.67;
        boolean flag = true;
        char ch = 'A';
        Object obj = 200;
        
        // Converting to String
        String s1 = String.valueOf(num);     // "100"
        String s2 = String.valueOf(d);       // "55.67"
        String s3 = String.valueOf(flag);    // "true"
        String s4 = String.valueOf(ch);      // "A"
        String s5 = String.valueOf(obj);     // "200"

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
