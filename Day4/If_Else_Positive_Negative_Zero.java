package Day4;

public class If_Else_Positive_Negative_Zero 
{
	public static void main(String[] args)
	{
		//int num=10; //Positive
		//int num=-5; // Negative
		int num=0; // Zero
		if(num>0)
		{
			System.out.println("Number is Positive :" +" "+num);
		}
		else if(num<0)
		{
			System.out.println("Number is Negative :" +" "+num);
		}
		else
		{
			System.out.println("Number Is Zero :"+ " "+num);
		}
	}

}
