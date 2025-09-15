package Day7;

import java.util.Arrays;

public class SortingElementsInArray 
{
	public static void main(String[] args) 
	{
		int a[] = {100, 300,200,1000,800, 500, 900, 600};
		System.out.println("Before Sorting Array : ");
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.print( a[i] + ",");
			System.out.println();
		}
		//Or you can write like this without for loop
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a));
		//-----
			Arrays.sort(a);
			System.out.println("After Arrays Sorting");
			System.out.println(Arrays.toString(a));
		}
}
