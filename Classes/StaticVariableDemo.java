package ClassesDemo;



/*Static variable → Only one copy is created in memory, and it is shared among all objects of that class. If one object changes the value, the change is reflected for all other objects.

Static method → It can be called using the class name (without creating an object). It can directly access only static variables and other static methods.

So yes, every object of the class will access the same static variable, not a separate copy.*/

class Demo {
    static int count = 0;

    Demo() {
        count++;
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        System.out.println(Demo.count); // prints 3
    }
}
