package Assignment_FIS;
import java.util.Scanner;

public class Total_Number_of_Characters_In_Name 

{
	public static void main(String[] args)
	{ 
	/* String str="Sudheer HD";
	System.out.println(str.length());
	*/
	Scanner myobj = new Scanner(System.in);
	System.out.println("Enter User Name : ");
	
	String name = myobj.nextLine();
	System.out.println("Total number of characters in name : " + name.length());
	 
	}
}
