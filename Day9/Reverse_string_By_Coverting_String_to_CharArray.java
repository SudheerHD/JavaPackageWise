package Day9;

import java.util.Arrays;

public class Reverse_string_By_Coverting_String_to_CharArray 
{
	public static void main(String[] args) 
	{
	String s = "Welcome";
	String rev = "";
	char a[] = s.toCharArray(); // converting string to array
	System.out.println(Arrays.toString(a));
	for(int i=a.length-1;i>=0;i--)
	{
		rev = rev + a[i];
	}
	System.out.println("Revesed String by using charArray : " + rev);
	}
}
