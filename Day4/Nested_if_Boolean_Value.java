package Day4;

public class Nested_if_Boolean_Value 
{

	public static void main(String[] args)
	{
		//if (true) // ABC
			//if(false) //XYZ
		if(true) // CBA to check else statement inside if condition
		{
			//if(true)
			if (false) //CBA
		{
				
			System.out.println("ABC");
			}
		     else 
		     {
			 System.out.println("CBA");
		     }
	    }   
		     else
		     {
		    	 System.out.println("XYZ");
		     }
	   }
}
