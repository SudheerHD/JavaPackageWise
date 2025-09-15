package Day16;

public class Class_C2 extends C1_Class
{
	public static void main(String[] args) 
	{
		Class_C2 c2 = new Class_C2();
		c2.m1(); // Called from child class c1 
		c2.m2(); // called from child class c1
		String a = c2.m3(); // Directly class_c1 Method implemented to call in grand child class_C2 
		System.out.println(a);
	}

}
