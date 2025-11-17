package Abstraction;

abstract class Car
{
	void start()  //Non-abstract method /normal/default
	{
		System.out.println("Starting...");
	}
	
	abstract void drive();  //abstract method.(no implementation)
	
	final void stop()  //final method, cannot override in child class
	{
		System.out.println("Stopping...");
	}
	
	
	static void park()   // directly access through class
	{
		System.out.println("Parking....");
	}
}


class Camry extends Car
{

	void drive() {
		System.out.println("Driving safely....");
		
	}
	
}



public class AbstractionDemo {

	public static void main(String[] args) {
				
		//Car c=new Car(); // invalid. Car is abstract class. we cannot create object
		
		
		/*Camry h=new Camry(); //valid but we cannot achive data abstraction
		h.start(); // normal
		h.drive();  // abstract
		h.stop();  // final
		Car.park();  */
		
		
		
		/*Car h=new Camry(); //valid
		h.start(); // normal
		h.drive();  // abstract
		h.stop();  // final
		Car.park();  */
		
		
		
	}

}
