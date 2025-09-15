package Day16;

interface Shape
{
	int length = 10; // final & static
	int width = 20; // final & static
	
	void circle(); // Abstract method no implementation, semi colon ended methods.
	
	default void square()
	{
		System.out.println("This is square - Default method"); // default or static key word is need for interface class
	}
	
	static void rectangle()
	{
		System.out.println("This is rectangle - static method"); // default or static key word is need for interface class
	}
}


public class InterfaceDemo implements Shape
{
	public void circle()
	{
		System.out.println("This is Circle - Abstract Method");
	}
	void triangle() // we can create new methods in class this is not belongs to interface.
	{
		System.out.println("This is triangle...");
	}
	
	int x=100, y=200;
	
	public static void main(String[] args) 
	{
		//Scenario 1
		InterfaceDemo id= new InterfaceDemo();
		id.circle(); //abstract
		id.square(); //Default
		Shape.rectangle(); //static method can directly access from interface
		id.triangle(); // created in class, so in class object we can call
		System.out.println(id.x + id.y); // Class variable are called through object instance. - This class is belongs to class
		
		//Scenario 02
		Shape sh = new InterfaceDemo (); // we can create object reference for interface not object instantiate, instantiate only created to class
		sh.circle(); // Abstract 
		sh.square(); // Default
		
		Shape.rectangle();  //static method can directly access from interface
		// sh.triangle(); // error - we cannot access This method is not created in interface, if you create class object but assigned interface variable.
		
		System.out.println(Shape.length * Shape.width); // accessing static variables directly - Static & final they are associated with the interface itself, not any specific instance  
		//System.out.println(sh.x + sh.y); // error - we cannot access
	}

}
