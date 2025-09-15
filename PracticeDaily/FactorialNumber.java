package PracticeDaily;

import java.util.Scanner;

public class FactorialNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the how many factorial number you want : ");
		int n = sc.nextInt();
		//int n = 5;
		int factorial =1;
		
		for (int i=1 ; i<=n ; i++ )
		{
			
			factorial = factorial*i;
			//System.out.println(i);
		}
		System.out.println(factorial);

	}

}
