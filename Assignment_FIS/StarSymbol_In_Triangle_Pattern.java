package Assignment_FIS;

public class StarSymbol_In_Triangle_Pattern 
{
	public static void main(String[] args) 
	{
		
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*" + " ");
		}
		System.out.println();
	}	 
	
	for(int a=10;a>=0;a--)
	{
		for(int b=a+1;b>=1;b--)
		{
			System.out.print("*" + " ");
		}
		System.out.println();
	} 
	}
}

