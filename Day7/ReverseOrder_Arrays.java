package Day7;

import java.util.Arrays;

public class ReverseOrder_Arrays 
{
	public static void main(String[] args) 
	{
		int a[] = {100,80,30,40,20,60,70,30,90,10};
		System.out.println("Before reverse order");
		for(int value:a)
		{
			System.out.println(value);
		}
		Arrays.sort(a);
		System.out.println("After revesed number");
		for(int i=a.length-1;i>=0;i--)
			System.out.println(a[i]);
	}

}
