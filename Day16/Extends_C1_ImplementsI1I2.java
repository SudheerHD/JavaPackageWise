package Day16;

public class Extends_C1_ImplementsI1I2 extends C1_Class implements I1, I2
{
	public void m1() // implemented from interface I1 abstract method
	 {
		 System.out.println(x);
	 }
	 
	 public void m2() // implemented from interface I2 abstract method
	 {
		 System.out.println(y);
	 }
	

	public static void main(String[] args) 
	{
		Extends_C1_ImplementsI1I2 eci = new Extends_C1_ImplementsI1I2();
		eci.m1();
		eci.m2();
		String b= eci.m3();
		System.out.println(b);

	}

}
