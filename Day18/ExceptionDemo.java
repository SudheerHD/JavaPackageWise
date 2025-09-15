package Day18;

import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		System.out.println("Program is started....");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		//Example - 01
		/*int num = sc.nextInt();
		
		System.out.println(100/num);  //ArithmeticException
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
		*/
		
		//Example - 02
		
		 int a[] = new int[5];
		 
		System.out.println("Enter Array's position with in 0-4:");
		
		int pos = sc.nextInt(); //ArrayIndexOutOfBoundsException
		System.out.println("Enter a value");
		
		int value = sc.nextInt();
		
		a[pos]=value;
		System.out.println(a[pos]);
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
		
		
		//Example - 03
		/*String s = "Welcome";
		int a = Integer.parseInt(s); // NumberFormatException
		System.out.println(a);
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
		*/
		
		//Example - 03
		/*String s = null;
		System.out.println(s.length()); //NullPointerException
				
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
		*/
	}

}
