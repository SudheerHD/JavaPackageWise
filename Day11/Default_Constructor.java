package Day11;

public class Default_Constructor 
{
	//class level variable
		int x, y;
		
		//Methods.
		Default_Constructor() //Default constructor.
		{
			x=100;
			y=200;
		}
		
		void sum()
		{
			System.out.println(x+y);
		}

		public static void main(String[] args) 
		{
			Default_Constructor dpc = new Default_Constructor(); //Default constructor
			dpc.sum();
		}
}