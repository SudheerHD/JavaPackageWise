package Day7;

import java.util.Scanner;

public class RunTimeDataInput_ByUsing_EmptyArray_Scanner_Class 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int a[] = new int[4];
	System.out.println("Enter Array elements: ");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.print("Printing Array elements : ");
	for(int j=0;j<a.length;j++)
	{
		System.out.print(" "+ a[j]);
	}
	}
	
}
