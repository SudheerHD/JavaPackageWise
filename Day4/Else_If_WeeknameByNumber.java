package Day4;

public class Else_If_WeeknameByNumber {

	public static void main(String[] args)
	{
	//int num=1; //Sunday
	//int num=4; //Wednesday
		//int num=6; //Friday
		int num=10; //Invalid
	if(num==1)
	{
		System.out.println("Sunday");
	}
	else if(num==2)
	{
    System.out.println("monday");
	}
	else if(num==3)
	{
		System.out.println("Tuesday");
	}
	else if(num==4)
	{
		System.out.println("Wednesday");
	}
	else if(num==5)
	{
		System.out.println("Thursday");
	}
	else if(num==6)
	{
		System.out.println("Friday");
	}	
	else if(num==7)
	{
		System.out.println("Saturday");
	}
	else
	{
		System.out.println("Invalid");
	}
}
}