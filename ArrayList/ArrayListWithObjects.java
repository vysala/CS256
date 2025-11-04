package VRecord;

import java.util.*;

class Student{
 int rollno;
 String name;
 int age;
 
 public Student(int rollno, String name, int age) {
    this.rollno = rollno;
    this.name = name;
    this.age = age;
 }


}



public class ArrayListWithObjects {
    public static void main(String[] args) {

        Student s1=new Student(101,"Bob",25);
        Student s2=new Student(103,"Alice",21);
        Student s3=new Student(40,"John",11);

        // Declare an ArrayList
        ArrayList<Student> mylist=new ArrayList<Student>();
        mylist.add(s1);
        mylist.add(s2);
        mylist.add(s3);

        // enhanced for loop 

        /*for(Student elem:mylist){
            System.out.println(elem.rollno + " " +elem.name + " " + elem.age);

        }*/

        //  using iterator() 

        Iterator iter=mylist.iterator();
         while(iter.hasNext()){

           // System.out.println(iter.next());

           Student st= (Student)iter.next();
           System.out.println(st.rollno + " " + st.name + " " + st.age);
         }

        
    }

}
