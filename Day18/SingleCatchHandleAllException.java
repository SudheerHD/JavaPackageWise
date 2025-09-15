package Day18;

public class SingleCatchHandleAllException {

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
		catch (Exception e) // when you know exception
		{
			System.out.println("Exception handled...");
			System.out.println(e.getMessage());
		}
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
		*/
		
		String s = null;
		try
		{
			System.out.println(s.length());
		}
		catch (Exception e) // Exception is supper class have all methods so it will handle all exceptions.
		{
			System.out.println("Exception handled...");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
	}

}
