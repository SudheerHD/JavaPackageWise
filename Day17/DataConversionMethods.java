package Day17;

public class DataConversionMethods 
{

	public static void main(String[] args) 
	{
		/*String s = "Welcome"; //Cannot convert to Int (error: NumberFormatException)
		System.out.println(Integer.parseInt(s));
		*/
		//Converting one format to Another format
		//String to Integer.
		String s1 = "10";
		String s2 = "20";
		System.out.println(s1+s2); // 1020 - it is just concatenated.
		
		System.out.println(Integer.parseInt(s1)+ Integer.parseInt(s2)); //30 
		
		//String to Decimal(Double)
		String s3 = "10.50";
		String s4 = "15.01";
		System.out.println(Double.parseDouble(s3) + Double.parseDouble(s4)); //25.509999999999998
		System.out.println(Double.parseDouble(s3) + Integer.parseInt(s2)); // Double + Integer // 30.5
		
		//String to Boolean
		String s5 = "true";
		String s6 = "false";
		String s7 = "Welcome";
		System.out.println(Boolean.parseBoolean(s5)); // true
		System.out.println(Boolean.parseBoolean(s6)); // false
		System.out.println(Boolean.parseBoolean(s7)); // by defaults false for other boolean values like string interger 
		
		// String to Char is not possible because cannot convert string to single char.
		
		// Converting other Primitive data type to String
		// int, double, boolean, Char 
		int a = 1234;
		double b = 123.45;
		boolean bool = true;
		char d = 'A'; 
		
		System.out.println(String.valueOf(a)); //1234
		System.out.println(String.valueOf(b)); //123.45
		System.out.println(String.valueOf(bool)); //true
		System.out.println(String.valueOf(d)); // A
		
		System.out.println(String.valueOf(a) + String.valueOf(b)); // 1234123.45 - after converting concatenated two strings
		
		String e = String.valueOf(a); // Assigned value to new variable and called that variable in print statement.
		System.out.println(e); // 1234
		
		e = String.valueOf(b); // same variable will replace old value to new value (new value will be assigned.
		System.out.println(e); // 123.45
	}

}
