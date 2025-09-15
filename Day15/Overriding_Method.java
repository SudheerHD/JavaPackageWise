package Day15;

class Bank
{
	double rateofInterest()
	{
		return 0;
	}
}
class ICICI extends Bank
{
	double rateofInterest()
	{
		return 15.5;
	}
}
class SBI extends Bank
{
	double rateofInterest()
	{
		return 25.6;
	}
}

public class Overriding_Method 
{

	public static void main(String[] args) 
	{
		ICICI ic=new ICICI();
		System.out.println(ic.rateofInterest());
		
		SBI sb=new SBI();
		double rate=sb.rateofInterest(); //assigned variable , just to see how it will work.
		System.out.println(rate); //same variable used to print	
	}

}
