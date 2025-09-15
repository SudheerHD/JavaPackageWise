package Day19;

class Parent
{
	String name = "John";
	
	void m1()
	{
		System.out.println("This is m1 from Parent class...");
	}
}

class Child extends Parent
{
	int id = 101;
	
	void m2()
	{
		System.out.println("This is m2 Child class...");
	}
}
public class TypeCastingObject 
{
	public static void main(String[] args) 
	{
		/*Child ch = new Child();
		System.out.println(ch.name); //Parent 
		ch.m1();
		System.out.println(ch.id); //Child
		ch.m2();
		*/
		
		/*Parent p = new Child();  // upcasting
		System.out.println(p.name); //Parent
		p.m1(); */
		/*System.out.println(p.id); //Child // We cannot access
		p.m2(); //Even though we created object for child (new Child()), We cannot access all thing from child class, we can access only parent things
		*/
		
		//Downcasting  // we will receive run time exception.
		Parent pa = new Parent();
		Child cd = (Child) pa; //Exception in run time - class Day19.Parent cannot be cast to class Day19.Child
		
		System.out.println(cd.name);
		System.out.println(cd.id);  
		cd.m1();
		cd.m2();		
	}

}
