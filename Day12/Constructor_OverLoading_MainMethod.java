package Day12;

public class Constructor_OverLoading_MainMethod {

	public static void main(String[] args) 
	{
		//1. individually assigned variable values
		Constructor_OverLoading_Method com1 = new Constructor_OverLoading_Method();
		System.out.println(com1.volume());
		//2. With parameters
		Constructor_OverLoading_Method com2 = new Constructor_OverLoading_Method(10.05, 20.35, 30.45);
		System.out.println(com2.volume());
		//3. Taking one parameters assigned values to all variables;
		Constructor_OverLoading_Method com3 = new Constructor_OverLoading_Method(55.65);
		System.out.println(com3.volume());
	}

}
