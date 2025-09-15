package Day19;

//Upcasting - converting values from Smaller ---> Larger
//int ---> long
//float ---> double

//Downcasting - converting values from Larger ---> Smaller
//long ---> int
//double ---> float


public class TypeCastingConcept 
{

	public static void main(String[] args) 
	{
		//Upcasting -- Automatic --- Smaller to Larger
		System.out.println("Upcasting -- Automatic --- Smaller to Larger");
		int intvalue = 100;
		long longvalue = intvalue;
		System.out.println(longvalue);
		
		float floatvalue = 123.34f;
		double doublevalue = floatvalue;
		System.out.println(doublevalue);
		
		//Downcasting -- manually --- Larger to Smaller
		System.out.println("Downcasting -- manually --- Larger to Smaller");
		long longvalue1 = 1000000;
		int intvalue1 = (int) longvalue1;
		System.out.println(intvalue1);
		
		double doublevalue1 = 1001230000.009815f;
		float floatvalue1 = (float) doublevalue1;
		System.out.println(floatvalue1);
		
		//Example1.
		int i=100;
		double d = i; // - Upcasting.
		System.out.println("Example - 01 for upcasting : " + d);
		
		//Example2.
		double d2=10.05;
		int i2 = (int) d2; // - downcasting.
		System.out.println("Example - 02 for downcasting : " + i2);
		
	}

}
