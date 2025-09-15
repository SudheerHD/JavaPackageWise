package Day18;

public class MultipleCatchBlocks 
{

	public static void main(String[] args) 
	{
		System.out.println("Program is started....");
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		*/
		/*try
		{
		System.out.println(100/num); // ArithmeticException
		}
		catch (ArithmeticException e) // when you know exception
		{
			System.out.println("Invalid Data...");
		}
		*/
		//when you dont know you can write multiple exception. it will support one or more catch statement.
		/*try
		{
		System.out.println(100/num); 
		}
		*/
		String s = null;
		try
		{
			System.out.println(s.length());
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Exception handled...");
			System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Exception handled...");
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException e) 
		{
			System.out.println("Exception handled...");
			System.out.println(e.getMessage());
		}
		catch (NullPointerException e) 
		{
			System.out.println("Exception handled...");
			System.out.println(e.getMessage());
		}
		
		//etc.....
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
	}

}
