package Day7;
import java.util.Scanner;
public class RunTimeDataInput_ByUsing_Scanner_Class 
{
	public static void main(String[] args) 
	{
		//Only one number display//
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		System.out.println(num);
		*/
		///-- Run time data storing in Array-- //
		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		System.out.println("Enter Number");
		for (int i=0;i<a.length;i++)
		{
		a[i] = sc.nextInt();
		}
		//with Arrays tostring (short key using)
		//System.out.println(Arrays.toString(a));
		/// with for loop ///
		System.out.println("Arrays data : ");
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}

}
