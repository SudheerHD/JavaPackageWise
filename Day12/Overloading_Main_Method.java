package Day12;

public class Overloading_Main_Method 
{
	void main(int x)
	{
		System.out.println(x);
	}
	void main(int x, int y)
	{
		System.out.println(x+y);
	}
	void main(String name1)
	{
		System.out.println(name1);
	}
	void main(String name2, String name3)
	{
		System.out.println(name2 + "  " + name3);
	}
	public static void main(String[] args) 
	{
		//To access main method in object.
		//but We need to create object in actual main method.
		Overloading_Main_Method omm = new Overloading_Main_Method();
		omm.main(100);
		omm.main("john");
		omm.main(10, 20);
		omm.main("Hello", "Robert");
	}

}
