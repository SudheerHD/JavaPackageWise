package Day13;

public class StaticDemo 
{
	static int a=10; // Static variable.
	int b = 20;  // Non Static variable.
	
	static void m1() //static method
	{
		System.out.println("This is m1 static method...");
		/*StaticDemo sd1=new StaticDemo();  with the help of object we can call non static methods in static methods 
		sd1.m2(); */
	}
	
	void m2()
	{
		System.out.println("This is m2 non static method...");
	}
	
	void m3() // 3. non static method
	// non-static method can access everything directly (including static variable & Method , Non static Variable & Method.
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) 
	{
		//1. 
		System.out.println(a); // without object we can call directly everywhere.
		m1(); // without object we can call directly everywhere.
		//2
		StaticDemo sd=new StaticDemo(); // non static need to create object.
		System.out.println(sd.b);
		sd.m2();
		//3
		sd.m3();
	}

}
