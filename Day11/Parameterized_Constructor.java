package Day11;

public class Parameterized_Constructor 
{
	//class level variable
		int x, y;
		
				
		//Parameterized constructor.
		Parameterized_Constructor(int a, int b)
		{
			x=a;
			y=b;
		}
		
		void sum()
		{
			System.out.println(x+y);
		}

		public static void main(String[] args) 
		{
			Parameterized_Constructor dpc = new Parameterized_Constructor(10,20); //Parameterized constructor
			Parameterized_Constructor dpc1 = new Parameterized_Constructor(10,40); //we can create multiple object
			dpc.sum();
			dpc1.sum(); 
			

		}


}
