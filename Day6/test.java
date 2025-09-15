package Day6;

public class test {

	public static void main(String[] args) 
	{
		/*int a[][] = {
				{10,20},
				{30,40},
				{50,60},
				{70,80},
				{90,100}
					};*/
		int a[][]=new int[4][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		a[3][0]=70;
		a[3][1]=80;
		System.out.println("Rows Counts : " + a.length);
		System.out.println("Columns Count : " + a[0].length);
		System.out.println(a[3].length);
		//for(int r=0;r<=4;r++)
		for(int r=0;r<=a.length-1;r++) //or use this also (r<a.length)
		{
			//for(int c=0;c<=a[r].length-1;c++) // (c<a[1].length) or (c<a[r].length)
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print("  " + a[r] [c]);
			}
			System.out.println();
		}
	}

}
