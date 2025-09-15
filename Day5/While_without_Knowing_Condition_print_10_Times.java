package Day5;

public class While_without_Knowing_Condition_print_10_Times

{
	public static void main(String[] args)
	{
	 /* int i =1;
	while(true)
	{
		System.out.println("Hello");  //it will print infinity 
	} */
	
	int i =1;
	while(true)
	{
	System.out.println("Hello");
	i++;
	if(i==10)
	{
		break;
	}
	}
}
}