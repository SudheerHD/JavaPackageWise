package Day5;

public class jumping_Statement_Continue 
{

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)  //1,2,3,4,6,7,8,9,10 - here 5 skipped continued next time because i==5 true without printing it will continue to for loop
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
