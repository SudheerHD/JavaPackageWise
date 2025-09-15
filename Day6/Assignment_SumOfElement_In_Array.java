package Day6;

public class Assignment_SumOfElement_In_Array 
{
	public static void main(String[] args)
	{
	int a[]= new int[5];
	int sum=0;
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
	//for (int arr:a)
	for(int x=0;x<=a.length-1;x++)
	{
		//sum += arr;
		int b=a[x];
		sum += b;
	}
	System.out.println(sum);
	}
}
