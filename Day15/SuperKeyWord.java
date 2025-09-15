package Day15;

public class SuperKeyWord 
{
	String color = "white";
	
	
	void eat()
	{
		System.out.println("eating..");
	}
}


class Dog extends SuperKeyWord
{
	String color = "Black";
	
	void DisplayColor()
	{
		System.out.println(super.color); // White// Super invoke immediate parent class
	}
	
	//to verify method super
	void eat()
	{
		//System.out.println("eating bread..");
		super.eat(); //eating..
	}
}

