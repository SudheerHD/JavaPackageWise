package Day11;

public class Greetings 
{
// 1. No Parameters    No return values.
	void m1()
	{
		System.out.println("Hello...");
	}
// 2. No Parameters    Returns values.
	String m2()
	{
		return("Hello How are you?.."); // return statement will returns some values (Returns some outputs)
	}
// 3. Takes Parameters   No returns values.
	void m3(String name)
	{
		System.out.println("Hello" + " " + name);
	}
// 4. Takes Parameters   Returns values.
	String m4(String name)
	{
		return("Hello.." + " "+ name);
	}
}
