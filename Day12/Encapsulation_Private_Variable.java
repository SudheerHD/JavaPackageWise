package Day12;

public class Encapsulation_Private_Variable 
{
	private int accno;
	private String name;
	private double amount;
	
	//To access variable create two methods get set.
	//manually created get and set method
	int getaccno()
	{
		return(accno);
	}
	void setaccno(int accno)
	{
		this.accno=accno;
	}
	//system shortcut --Source--generate get & set and select list
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getAmount() 
	{
		return amount;
	}
	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
	
}
