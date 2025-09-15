package Day9;

public class Reverse_String_By_Using_StringBuffer_StringBuilder 
{
	public static void main(String[] args) 
	
	{
		
		//Method - 01
		StringBuffer s = new StringBuffer("Welcome"); // reverse() methods only have in StringBuffer & StringBuilder 
		System.out.println("Revese string by using StringBuffer : "+ s.reverse()); // revesed method not there in String variable.
		
		//Method - 02
		StringBuilder r = new StringBuilder("Welcome");
		System.out.println("Revese string by using StringBuilder : " + r.reverse());
		
		//Immutable, Mutable
		//String - Immutable - cannot change.
		String a = "Welcome";
		a.concat("To Java");
		System.out.println(a); // Welcome
		String b = a.concat(" to java"); // to change value we need to assign another variable
		System.out.println(b);
		
		//StringBuffer - Mutable. we can change value.
		StringBuffer c = new StringBuffer("Bangalore");
		c.append(" is Tech City");	// append is same as concate it will used in StringBuffer  			
		System.out.println(c);
		
		//StringBuilder
		StringBuilder d = new StringBuilder("Bangalore");
		d.append(" is Tech City");	// append is same as concate it will used in StringBuilder  			
		System.out.println(d);
	}
}
