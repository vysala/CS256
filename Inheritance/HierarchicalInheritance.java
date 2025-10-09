package InheritDemo;

//Parent
class Animal
{
	void eat()
	{
		System.out.println("Animal is eating...");
	}
}

//Child 1
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is barking...");
	}
}

//Child2
class Cat extends Animal
{
	void meow()
	{
		System.out.println("Cat is meowing.....");
	}
}



public class HierarchicalInheritance {

	public static void main(String[] args) {
	
		/* Dog d=new Dog();
		d.eat();// Parent
		d.bark(); // Dog  */
		
		
		
		/*Cat c=new Cat();
		c.eat(); //Parent
		c.meow(); //Cat */
		
		
		/*Animal a=new Dog();
		a.eat(); */
		
		
		/*Animal an=new Cat();
		an.eat();
		*/ 
		
		
		
		
		
		
	}

}
