package Day7;

import java.util.Arrays;

public class ReverseNum 
{

	public static void main(String[] args) 
	{
	/*	int num = 12345;
		String rev = "";
		String s = Integer.toString(num);
		char dig [] = s.toCharArray();
		
		for (int i=dig.length-1;i>=0;i--)
		{
			rev = rev + dig[i];
		}
		int a = Integer.parseInt(rev);
		System.out.println(a);
		
		*/
		//Integer.toString, s.charAt(i)
		int num = 12345;
		String rev = "";
		String s = Integer.toString(num);
		
		for (int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		int a = Integer.parseInt(rev);
		System.out.println(a);

	}

}
