package Day6;

public class Object_Variable_Diff_data_Array 
{
	public static void main(String[] args)
	{
	/*
	 *int a[]= {100,200,300,"Test",True};
	 for(int x:a)
	{
		System.out.println(a[x]);
	}
	*/
	Object a[] = {100,200,300,"Test",true};
	for(Object x:a)
	//for (int x=0;x<=a.length-1;x++)
	{
		/* Object b =a[x];
		System.out.println(b); */
		System.out.println(x);
	}
	}
}
