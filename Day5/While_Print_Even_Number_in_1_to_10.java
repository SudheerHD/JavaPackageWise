package Day5;

public class While_Print_Even_Number_in_1_to_10 
{
	public static void main(String[] args)
	{
		// Approach -01 
		/*int i=2;
		while(i<=10)
		{
			System.out.println("Even number :" + " "+ i);
			//i+=2;
			i=i+2;
		} */
		
		//Approach - 02
		int i=1;
		//System.out.print("Even number : ");
		while(i<=10)
		{
			if (i%2==0)
			{
				System.out.println("Even number :" + " "+ i);
			//	System.out.print(i +","); //Even number : 2,4,6,8,10,
			}
		  i++;
		}
	}
}
