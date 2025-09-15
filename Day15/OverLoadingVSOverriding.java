package Day15;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
	System.out.println(b);
	}
}

class XYZ extends ABC
{
	void m1(int a) //overriding.
	{
		System.out.println(a*a);
	}
	
	void m2(int b) //Overriding
	{
		System.out.println(b+b);
	}
	void m1(int a, int b) // Overloading
	{
		System.out.println(a*b);
	}
}

public class OverLoadingVSOverriding 
{

	public static void main(String[] args) 
	{
	XYZ xy = new XYZ();
	xy.m1(10);
	xy.m2(20);
	xy.m1(30, 40);
	
	}

}
