package Day7;

import java.util.Arrays;

public class SortingChar_Arrays 
{
	public static void main(String[] args) 
	{
		char c[] = {'D','A','T','B','E','Z','P'};
		/*
		System.out.println("Before Sorting Char");
		// Enhanced for loop
		for(char x:c)
		{
			System.out.println(x);
		}
		*/
		System.out.println("Before Sorting Char");
		for(int i=0;i<c.length-1;i++)
		{
			System.out.println(c[i]);
		}
	
		System.out.println("After Sorting Char");
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		/*//Arrays listed with for loop
		System.out.println("After Sorting Char");
		for(int j=0;j<c.length;j++)
		{
			System.out.println(c[j]);
		}
		*/
	}
}
