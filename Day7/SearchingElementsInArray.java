package Day7;

public class SearchingElementsInArray 
{
	public static void main(String [] args)
	{
		int a[] = {10, 30, 40, 50, 20, 80, 70};
		int search_element = 40;  //false = not found true = found
		boolean status = false;
		for(int i=0;i<=a.length-1;i++)
		{
			if (a[i] == search_element)
			{
				System.out.println("Element found : " + a[i] );
				status = true;
				break;
			}
		}	
			if(status == false)
			{
			System.out.println("Element not found : " + search_element);	
			}
	}

}
