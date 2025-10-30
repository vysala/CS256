package ArraysOfObjects;
import java.util.Arrays;


public class ArrayVsArrayofObjects {
public static void main(String[] args) {

    /*int[] a=new int[3];
    a[0]=10;
    a[1]=20;
    a[2]=30;*/

    int[] a={10,20,30};
     
    for(int i=0;i<a.length;i++){
        System.out.print(a[i] + " ");
    }

    System.out.println();

    String[] myarr={"one", "two", "three"};
    System.out.println(Arrays.toString(myarr)); 
    
    Student[] s=new Student[3];
    s[0]=new Student(50,"Sam");
    s[1]=new Student(60,"Dan");
    s[2]=new Student(5, "John");

    System.out.println(s[0].name);

    for(int i=0;i<s.length;i++)
    {
        System.out.println(s[i].roll_no + " " + s[i].name);
    }

     for(Student studelement:s){
        System.out.println(studelement.roll_no + " " + studelement.name);
    }
}
}
