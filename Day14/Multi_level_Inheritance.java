package Day14;

class Parent1  // Parent Class.
{
	// int x=100; //hard code data initialization.
	int x; // will initialize data in run time.
	void display()
	{
		System.out.println(x);
	}
}
class Child1 extends Parent1   // child1 is child class.
{
	//int y =200;
	int y;
	void show()
	{
		System.out.println(y);
	}
}
class Child2 extends Child1  // child2 is child class.
{
	//int z=300;
	int z;
	void print()
	{
		System.out.println(z);
	}
}

public class Multi_level_Inheritance 
{

	public static void main(String[] args) 
	{
		Child2 cobj = new Child2();
		
		//Data initialization in run time.
		cobj.x=400;
		cobj.y=500;
		cobj.z=600;
		
		System.out.println(cobj.x);
		System.out.println(cobj.y);
		System.out.println(cobj.z);
		
		System.out.println("-----------");
		
		cobj.display();
		cobj.show();
		cobj.print();

	}

}
