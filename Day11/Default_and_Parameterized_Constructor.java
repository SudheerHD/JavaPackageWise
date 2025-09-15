package Day11;

public class Default_and_Parameterized_Constructor
{
	//class level variable
	int x, y;
	
	//Methods.
	Default_and_Parameterized_Constructor() //Default constructor.
	{
		x=100;
		y=200;
	}
	
	//Parameterized constructor.
	Default_and_Parameterized_Constructor(int a, int b)
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) 
	{
		//Default_and_Parameterized_Constructor dpc = new Default_and_Parameterized_Constructor(); //Default constructor
		Default_and_Parameterized_Constructor dpc = new Default_and_Parameterized_Constructor(10,20); //Parameterized constructor
		dpc.sum();
		

	}

}
