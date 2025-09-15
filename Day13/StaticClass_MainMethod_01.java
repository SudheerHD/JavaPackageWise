package Day13;

public class StaticClass_MainMethod_01 {

	public static void main(String[] args) 
	{
				
				//1. For Static Variable & method - "Explicitly mention class name"
				System.out.println(StaticClass_01.a); // without object we can call directly everywhere.
				StaticClass_01.m1(); // without object we can call directly everywhere.
				//2
				StaticClass_01 sc1=new StaticClass_01();
				// non static need create object.
				System.out.println(sc1.b);
				sc1.m2();
				//3
				sc1.m3();

	}

}
