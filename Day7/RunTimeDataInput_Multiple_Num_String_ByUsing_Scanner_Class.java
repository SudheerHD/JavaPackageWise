package Day7;
import java.util.Scanner;
public class RunTimeDataInput_Multiple_Num_String_ByUsing_Scanner_Class 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter anthing address, number, any values");
		String anything = sc.nextLine();
		System.out.println("User name is : " + name);
		System.out.println("User age is : " + age);
		System.out.println("Entered anthing address, number, any values : " +anything);
	}

}
