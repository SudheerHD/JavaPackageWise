package Day14;

class A1  // Parent Class.
{
	int x=100;
	void display()
	{
		System.out.println(x);
	}
}
class B2 extends A1   // B2 is child class.
{
	int y =200;
	void show()
	{
		System.out.println(y);
	}
}


public class Single_Inheritance 
{
	public static void main(String[] args) 
	{
		B2 bobj=new B2();
		bobj.display();
		bobj.show();
		System.out.println("---------");
		System.out.println(bobj.x);
		System.out.println(bobj.y);

	}

}
