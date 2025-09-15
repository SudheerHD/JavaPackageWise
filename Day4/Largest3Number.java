package Day4;

public class Largest3Number 
{
	public static void main(String[] args)
	{
		//int a=10, b=20, c=30; //C is larger than A and B : 30
		//int a=100, b=20, c=30; //A is larger than B and C : 100
		int a=100, b=20000, c=30; //B is larger than A and C : 20000
		if(a>b && a>c)
		{
			System.out.println("A is larger than B and C :" + " " + a );
		}
		else if (b>a && b>c)
		{
			System.out.println("B is larger than A and C :" + " " + b );
		}
		else
		{
			System.out.println("C is larger than A and B :" + " " + c );
		}
	}

}
