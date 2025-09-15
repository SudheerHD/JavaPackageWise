package Assignment_FIS;
import java.util.Scanner;

public class Fibonacci_series 
{
	public static void main(String[] args) 
	{
	 System.out.print("Enter N Fibonacci Series number : ");
     int nextnum, num1=0, num2=1;
     
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     System.out.println("Fibonacci series : "); 
     System.out.print(num1 +" " + num2); // first printing - 0 1
     for(int i=2;i<a;i++)
     {
    	 nextnum=num1+num2; // 1 2 3 4
    	 System.out.print(" " + nextnum); //1 2 3 4
    	 num1=num2;    //1 1 2 3
    	 num2=nextnum; //1 2 3 4
     } 
     	/*	for(int i=1; i<=10;i++)
    	  {
    	System.out.print(num1 + " "); // 0 1 1 2 3 5 8 13 21 34
   	    nextnum=num1+num2; // 1 2 3 5 8 13 21 34 55 89
    	num1=num2; // 1 1 2 3 5 8 13 21 34 55
    	num2=nextnum; // 1 2 3 5 8 13 21 34 55 89
    	nextnum=num1+num2; 
    	 
     } */
	}
}
