package Day7;

public class SearchingElementsInArray_EnhancedForLoop 
{
	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50,60};
		int search_elements = 50;
		boolean status = false;
		for(int i:a)
		{
			if(i==search_elements)
			{
			System.out.println("Array Elemens Found : " + i);
			status = true;
			break;
			}
		}
		if(status == false)
		{
			System.out.println("Array Elements not found : " + search_elements);
		}
	}
}
