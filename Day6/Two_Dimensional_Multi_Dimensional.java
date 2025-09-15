package Day6;

public class Two_Dimensional_Multi_Dimensional {

	public static void main(String[] args) 
	{
		//Normal declaration 
		/* int a[] [] = new int [3][2];
		a[0][0]= 100;
		a[0][1]= 200;
		
		a[1][0]= 300;
		a[1][1]= 400;
		
		a[2][0]= 500;
		a[2][1]= 600; 
		System.out.println(a[2][1]); */
		//Approach -2
		int a[] [] = { {100,200}, 
					   {300,400}, 
					   {500,600},
					   {700,800} };
		System.out.println("Length of rows : " + a.length); //rows count or size
		System.out.println("Length of columns : " + a[0].length ); //columns count size
		System.out.println(a[3][1]);
		System.out.println(a[2][0]);
	}

}
