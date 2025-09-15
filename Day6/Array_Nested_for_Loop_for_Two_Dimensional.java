package Day6;

public class Array_Nested_for_Loop_for_Two_Dimensional {

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
		System.out.println(a[4].length);
		//for(int r=0;r<=4;r++)
		for(int r=0;r<=a.length-1;r++) //or use this also (r<a.length)
		{
			//for(int c=0;c<=a[r].length-1;c++) // or (c<a[r].length)
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print("  " + a[r] [c]);
			}
			System.out.println();
		}
	}

}
