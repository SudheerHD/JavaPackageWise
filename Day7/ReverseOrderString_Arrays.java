package Day7;

import java.util.Arrays;

public class ReverseOrderString_Arrays 
{
	public static void main(String[] args)
	{
		String s[] = {"Dam","All","Ten","Teen","Team","Ball","Elephant","Zebra","Pan"};
		System.out.println("Before Sorting String : ");
		for (int i=0;i<s.length;i++)
		{
		System.out.println(s[i]);	
		}
	System.out.println("------------------------------------------------------------------");
	Arrays.sort(s);
	System.out.println("After Sorting String : " +Arrays.toString(s));
	System.out.println();
	System.out.println("------------------------------------------------------------------");
	//now reversing the string order wise.
	System.out.println("Revesed String in Decending order");
	for(int j=s.length-1;j>=0;j--)
	{
		System.out.println(s[j]);
	}
	}

}
