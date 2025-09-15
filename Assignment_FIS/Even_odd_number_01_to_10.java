package Assignment_FIS;

public class Even_odd_number_01_to_10
{
	public static void main(String[] args) 
	{
	/* for(int i=1;i<=10;i++)	
	{
	System.out.println("Even Number:");
	if(i%2==0)
		{
			System.out.println("Even Number : " + i);
		} 
		else {
			System.out.println("Odd  Number : " + i);
		}
	} */
		int i,j;
		System.out.println("Even Number:");
		for(i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.print(i +",");
			}
		}
		System.out.println();
		System.out.println("Odd Number:");
		for(j=1;j<=10;j++)
		{
			if(j%2!=0)
			{
				System.out.print(j +",");
			}
		}
	}
}
