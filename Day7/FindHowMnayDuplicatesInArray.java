package Day7;

public class FindHowMnayDuplicatesInArray 
{
	public static void main(String[] args) 
	{
		int a[] = {10,20,10,30,40,30,50,50,10};
		int count = 0;
		int search_elements = 10;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i] == search_elements)
			{
			count++;
			}
		}
			System.out.println("Total Duplicate search_elements for " + search_elements + " is : " + count);	
	}

}
