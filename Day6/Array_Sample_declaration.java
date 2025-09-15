package Day6;

public class Array_Sample_declaration
{
	public static void main(String[] args)
	{
		/*
		  *int a[] = new int [10];
	    a[0] = 100;
	    a[1] = 200;
	    a[2] = 300;
	    a[3] = 400;
	    a[4] = 500;
	    a[5] = 600;
	    a[6] = 700;
	    a[7] = 800;
	    a[8] = 900;
	    a[9] = 1000;
	    */
	    int a[] = {100,200,300,400,500,600};
	   // int b[] = {};
	    //System.out.println(a[3]);
	    System.out.println("Array total size a : " + a.length);
	   // System.out.println("Array total size b : " + b.length);
	    
	    //for (int i=0;i<=5;i++) //Normal way when you know the value or size of an array
	    // for (int i=0;i<=a.length-1;i++) // when we use <= then we have to reduce 1 count array start from 0 length take count 1 to total last value
	    //for (int i=0;i<a.length;i++) // here no need to reduce count because it < only
	    //Enhanced for Loop:
	    for (int x:a)
	    {
	    	System.out.println(x);
	    }
	}
}