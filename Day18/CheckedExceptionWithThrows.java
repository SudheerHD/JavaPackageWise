package Day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionWithThrows {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{
		System.out.println("Program is started....");
		System.out.println("Program is inprogress...");
		
		Thread.sleep(5000); //in main method throws InterruptedException
		
		FileInputStream file = new FileInputStream("C:\\TEST.txt"); //in main method throws FileNotFoundException
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");

	}

}

