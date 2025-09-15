package Day16;

public class C1_Class implements I1, I2
{
 public void m1() // implemented from interface I1 abstract method
 {
	 System.out.println(x);
 }
 
 public void m2() // implemented from interface I2 abstract method
 {
	 System.out.println(y);
 }
 
 String m3() // Directly class Method implemented to call in grand child class 
 {
	 return "Class method implemented in C1" ;
 }
	public static void main(String[] args) 
	{
		C1_Class c1 = new C1_Class();
		c1.m1();
		c1.m2();
		System.out.println(c1.m3());
		
	}

}
