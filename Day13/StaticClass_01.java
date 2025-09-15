package Day13;

public class StaticClass_01 
{
	static int a=10; // Static variable.
	int b = 20;  // Non Static variable.
	
	static void m1() //static method
	{
		System.out.println("This is m1 static method...");
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
}
