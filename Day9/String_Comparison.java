package Day9;

public class String_Comparison 
{
	public static void main(String[] args) 
	{
		//Scenario - 01
		String s1 = "Welcome";
		String s2 = "Welcome";
		System.out.println(s1==s2);  //true
		System.out.println(s1.equals(s2)); // true
		
		//Scenario - 02
		String s3 = new String ("Welcome");
		String s4 = new String ("Welcome");
		System.out.println(s3==s4);  //false  - == used to compare only primitive data type
		System.out.println(s3.equals(s4)); // true equals used to compare values of object
		
		//4
		//Scenario - 04
				String s9 = "Welcome";
				String s10 = new String ("Welcome");
				System.out.println(s9==s10);  //false  - == used to compare object - object is different s3 is String s4 is new string
				System.out.println(s9.equals(s10)); // true equals used to compare values of object
				
		//Scenario - 03
		String s5 = "abcd";
		String s6 = new String ("abcd");
		String s8 = s6;
		System.out.println(s5==s6);  //false  - == used to compare object +Value - object is different s3 is String s4 is new string
		System.out.println(s5.equals(s6)); // true equals used to compare values of object (Only values)
		System.out.println(s6==s8); //true s8 is assigned from s6 both are new object(same) so it is true
		System.out.println(s6.equals(s8));// true 
		System.out.println(s5==s8); //false object is different s5 - string s8 is new string object
		System.out.println(s5.equals(s8)); // true it is comparing values.
	}

}
