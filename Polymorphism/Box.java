package Polymorphism;

// constructor overloading

public class Box {

	
	double width,height,depth;
	
	Box()  // default constuctor
	{
		width=height=depth=0;
	}
	
	Box(double side)   // constructor with one parameter
	{
		width=height=depth=side;
	}
	
	Box(double width,double height,double depth)  // constructor with 3 parameters
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
		
	}
	
	double volume()
	{
		return width*height*depth;
		
	}
	
	
	public static void main(String[] args) {
		
		Box b1=new Box();//default constructor
		System.out.println(b1.volume()); //0.0
		
		Box b2=new Box(10);
		System.out.println(b2.volume()); //1000.0
		
		Box b3=new Box(2,5,10);  //valid
		System.out.println(b3.volume());//100.0
	
		Box b4=new Box(2.5,5.0,10.5);  
		System.out.println(b4.volume()); //131.25
	}

}
