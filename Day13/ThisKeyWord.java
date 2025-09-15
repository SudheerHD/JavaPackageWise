package Day13;

public class ThisKeyWord 
{
	int x, y;  //Class variable/instance variable
	
	/*ThisKeyWord(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	*/
	/*void setData(int a, int b)
	{
		x=a;
		y=b;
	}*/
	void setData(int x, int y)
	{
		/*x=x;
		y=y;*/
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
	//ThisKeyWord tk = new ThisKeyWord(10,20);
	ThisKeyWord tk = new ThisKeyWord();
	tk.setData(30, 40);
	tk.display();
	}

}
