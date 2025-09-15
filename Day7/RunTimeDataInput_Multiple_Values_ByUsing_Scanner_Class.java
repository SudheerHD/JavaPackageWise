package Day7;

import java.util.Scanner;

public class RunTimeDataInput_Multiple_Values_ByUsing_Scanner_Class 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1");
		int num1 = sc.nextInt();
		System.out.println("Enter Num2");
		int num2 = sc.nextInt();
		System.out.println("Total Sum : " +  (num1+num2));
	}
}
