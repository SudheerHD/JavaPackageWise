package Day17.Pack2;

import Day17.withinPackageAnotherPackage.Test1; // this will import only one call which you mentioned
//import Day17.withinPackageAnotherPackage.*; // it will import all class from the package

// Protected we need to extends by inheritance 
/*public class Test2 extends Test1
{
	public static void main(String[] args) 
	{
		/*Test1 t1 = new Test1();
		System.out.println(t1.x);
		t1.m1();
		*/
		
		/*Test2 t2 = new Test2();
		System.out.println(t2.x);
		t2.m1();
	}
	*/

// for public we can access directly 
public class Test2 
{
	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();
		System.out.println(t1.x);
		t1.m1();
		
		
		
	}
}
