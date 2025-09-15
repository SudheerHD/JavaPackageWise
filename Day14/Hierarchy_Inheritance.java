package Day14;

class Hie_Parent
{
	int u =150;
	void display(int a) // initializing data in method on run time
	{
		System.out.println(a);
	}
}

class Child3 extends Hie_Parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}

class Child4 extends Hie_Parent
{
	void print(int c)
	{
		System.out.println(c);
	}
}
public class Hierarchy_Inheritance 
{

	public static void main(String[] args) 
	{
		Child3 C3obj = new Child3();
		C3obj.display(100);
		C3obj.show(200);
		System.out.println(C3obj.u);
		
		System.out.println("-------");
		
		Child4 C4obj = new Child4();
		C4obj.display(300);
		C4obj.print(400);
	}

}
