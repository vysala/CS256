package InhertianceTopic;

class Animal1{

    void eat(){
        System.out.println("Animal eats");
    }

}

class Dog extends Animal1{

    void bark(){
        System.out.println("Dog barks");
    }
}
public class AnimalClient {
    public static void main(String[] args) {
        Animal1 a=new Animal1();
        a.eat();
        Dog d=new Dog();
        d.eat();
        d.bark();
        //Upcasting
        Animal1 a1=new Dog();
        a1.eat();
        //DownCasting
        Animal1 a2=new Dog();
        System.out.println("---- Downcasting ----");
        Dog d1=(Dog)a2;  // Downcasted  by saying a2 actually refers to Dog object
        d1.bark();
        d1.eat();

        
    }

}
