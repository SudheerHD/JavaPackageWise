package Day18;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		System.out.println("Program is started....");
		
		String s = null;
		//String s = "Welcome";
		try
		{
			System.out.println(s.length());
		}
		//catch (Exception e) // Exception is supper class have all methods so it will handle all exceptions.
		catch(NumberFormatException e)
		//catch(NullPointerException e)
		{
			System.out.println("Catch Block handled Exception...");
			System.out.println(e.getMessage());
		}
		finally // finally black will execute always if there is exception or no exception
		{
			System.out.println("You enter into finally block...");
		}
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
	}

}
