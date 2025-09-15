package Day15;

class Test
{
	final int x=100;
	
}

public class FinalKeyWord 
{

	public static void main(String[] args) 
	{
		Test t = new Test();
		//t.x=200; // incorrect because we cannot change values x is final
		System.out.println(t.x);

	}

}
