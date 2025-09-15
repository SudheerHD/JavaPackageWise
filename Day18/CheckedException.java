package Day18;

public class CheckedException 
{

	public static void main(String[] args) 
	{
		System.out.println("Program is started....");
		System.out.println("Program is inprogress...");
	//Thread.sleep(5000);
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{}
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");

	}

}
