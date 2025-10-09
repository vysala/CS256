package InheritDemo;

class Device
{
  void powerOn()
  {
	  System.out.println("Device is powered on..");
  }
}


class Mobile extends Device
{
	void call()
	{
		System.out.println("Calling from mobile...");
	}
}

class Smartphone extends Mobile
{
	void browse()
	{
		System.out.println("Browsing internet on smart phone ");
	}
}



public class MultiLevelInheritance 
{

	public static void main(String[] args) {
	
		Smartphone phone=new Smartphone();
		phone.powerOn(); // Device
		phone.call(); //Mobile
		phone.browse(); //Smartphone
	}

}
