package Day9;

public class Reverse_a_String_By_Length_ChaAt 
{
	public static void main(String[] args)
	{
		String s = "Welcome";
		String rev = "";
		System.out.println(s.length());
		for (int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("Reversed String : " + rev);
	}

}
