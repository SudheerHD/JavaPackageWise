package Day11;

public class GreetingMainsMethods {

	public static void main(String[] args) 
	{
	
	Greetings gr = new Greetings();
	// 1. No Parameters    No return values.
	gr.m1();
	
	// 2. No Parameters    Returns values.
	String s = gr.m2();
	System.out.println(s);
		
	// 3. Takes Parameters   No returns values.
	gr.m3("John");
	
	// 4. Takes Parameters   Returns values.
	String var = gr.m4("john");
	System.out.println(var);
	}

}
