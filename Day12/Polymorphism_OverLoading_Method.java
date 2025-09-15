package Day12;

public class Polymorphism_OverLoading_Method 
{
	//class level variable
	int a = 100, b = 200;
	
	//Methods
	//1. no parameter and method name same.
	void sum()
	{
		System.out.println(a+b);
	}
	//2. with parameter and method name same.
	void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	//3. Number of parameter is different and method name same.
	void sum(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}
	//4. with parameter different data type method name same.
	void sum(int x, double y)
	{
		System.out.println(x+y);
	}
	//5. different order parameter and method name same.
	//data type order changed that is called parameter order change
	void sum(double x, int y)
	{
		System.out.println(x+y);
	}
}
