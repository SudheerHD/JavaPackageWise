package PracticeDaily;

import java.util.Arrays;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		//String name = "1538901";
		String name = "Welcome to Sakleshpur";
		char a[]= name.toCharArray();
		String rev = "";
		//Arrays.sort(a); //ordering string char
		for(int i=a.length-1; i>=0; i--)
		{
		rev = rev+ name.charAt(i)	;
	//	System.out.print(a[i]);
		}
		System.out.println(rev);

	}

}
