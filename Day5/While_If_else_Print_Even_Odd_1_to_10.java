package Day5;

public class While_If_else_Print_Even_Odd_1_to_10 
{
	public static void main(String[] args)
	{
		int i=1;
		while(i<=10)
		{
			if (i%2==0)
			{
				System.out.println(i + " "+"Even number");
			}
			else
			{
				System.out.println(i + " "+"Odd number");
			}
			i++;
		}
	}

}
