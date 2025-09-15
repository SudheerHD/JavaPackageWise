package Day7;

import java.util.Arrays;

public class SortingString 
{
	public static void main(String[] args) 
	{
		String s[] = {"Dam","All","Ten","Teen","Team","Ball","Elephant","Zebra","Pan"};
		System.out.println("Before Sorting String : ");
		for (int i=0;i<s.length;i++)
		{
		System.out.println(s[i]);	
		}
	Arrays.sort(s);
	System.out.println("After Sorting String in Arrays : " + Arrays.toString(s));
	}
}	