package Day12;

public class Encapsulation_Private_Variable_MainMethod {

	public static void main(String[] args) 
	{
		Encapsulation_Private_Variable epv = new Encapsulation_Private_Variable();
		//setting variable value
		epv.setaccno(10001);
		epv.setName("John");
		epv.setAmount(1000.15);	
		//print value from getter
		System.out.println(epv.getaccno());
		System.out.println(epv.getName());
		System.out.println(epv.getAmount());
		}

}
