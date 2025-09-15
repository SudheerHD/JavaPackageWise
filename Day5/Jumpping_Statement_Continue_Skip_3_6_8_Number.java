package Day5;

public class Jumpping_Statement_Continue_Skip_3_6_8_Number {

	public static void main(String[] args)
	{
	for(int i=1;i<=10;i++)
	{
		if(i==3 || i==6 || i==8) //here 3,6,8 skipped continued next number because i==3 or i==6 or i==8 true without printing it will continue to for loop
		{
			continue;
		}
		System.out.println(i);
	}
	}

}
