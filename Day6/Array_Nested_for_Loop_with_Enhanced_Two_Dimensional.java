package Day6;

public class Array_Nested_for_Loop_with_Enhanced_Two_Dimensional 
{

	public static void main(String[] args) 
	{
		int a[][] = {
				{10,20},
				{30,40},
				{50,60},
				{70,80},
				{90,100}
					};
		System.out.println("Rows Counts : " + a.length);
		System.out.println("Columns Count : " + a[0].length);
		
		//Enhanced for loop for Array
		for (int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(" " + x);
			}
			System.out.println();
		}
			

	}

}
