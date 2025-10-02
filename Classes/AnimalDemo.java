package ClassesDemo;
class Animal{
 // Attributes (fields / properties)   
 String breed;
 int size;
 int age;
 String color;
//method
 void eat(){
   System.out.println(breed + " is eating...");
 }
}


public class AnimalDemo {

    public static void main(String[] args) {
        // Object 1 created 
        Animal a=new Animal();
        a.age=2;
        a.breed="lab";
        a.color="brown";
        a.size=80;
        a.eat();

         // object 2 created
         Animal b=new Animal();
        b.age=2;
        b.breed="Poodle";
        b.color="white";
        b.size=80;
        b.eat();

    } 

}
