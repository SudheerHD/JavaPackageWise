package Day19;

// A B = (C) D;

public class TypeCastingObject3 
{
	public static void main(String[] args) 
	{
		//Exm 1;
		//Object o = new String("welcome");
		//StringBuffer sb = (StringBuffer) o; // Rule 1 - Y, Rule 2 - Y, Rule 3 - failed
		
		//Exm 2;
		//String s = new String("welcome");
		//StringBuffer sb = (StringBuffer) s; // Rule 1 - failed
		
		//Exm3:
		//Object o = new String("welcome");
		//StringBuffer sb = (StringBuffer) o; // Rule 1 - Y, Rule 2 - Y, Rule 3 - Failed
		
		//Exm4:
		//Object o = new String("welcome");
		//StringBuffer sb = (String) o; // Rule 1 - Y, Rule 2 - failed
		
		//Exm5:
		//String s = new String("welcome");
		//StringBuffer sb = (StringBuffer) s; // Rule 1 - Failed
		
		//Exm6
		//Object o = new String("welcome");
		//StringBuffer sb = (StringBuffer) o; //Rule 1 - Y, Rule 2 - Y, Rule - Failed
		
		//Exm7
		Object o = new String("welcome");
		String s = (String) o; // Rule 1 - Y, Rule 2 - Y, Rule 3 - Yes
		
		System.out.println(s);
	}

}
