package Day8;

import java.util.Arrays;

public class Strings_Methods 
{
	public static void main(String[] args)
	{
		//Length()
		String name = "SudheerHD";
		System.out.println("Length of the name : " +name.length());
		System.out.println("Welcome length : "+ "Welcome".length());
		//Concat() - Merging two string
		String name2 = "Bisle";
		System.out.println("Combined name and name2 : " +name.concat(name2));
		String name3 = "Sakleshpur";
		System.out.println("Combined name, Name2 and name3 : " + name+name2+name3);
		System.out.println("Combined name, Name2 and name3 : " + name.concat(name2).concat(name3));
		System.out.println("Combined name, Name2 and name3 : " + name.concat(name2+name3));
		System.out.println("Welcome".concat("Bangalore"));
		// Trim()
		String name4 = " SudheerHD  ";
		System.out.println("With Trim : "+ name4.trim());
		System.out.println("Without Trim : " +name4);
		System.out.println(name4.length());
		System.out.println(name4.trim().length());
		//CharAt() - Return Character from a string
		System.out.println(name3.charAt(2)); // k
		System.out.println(name3.charAt(0)); // s
		//Contains() returns true or false it is check string is part of main string
		String name5 = "Sakleshpur";
		System.out.println(name3.contains("kle")); // True
		System.out.println(name3.contains("Kle")); // false - Case sensitive
		System.out.println(name3.contains(name5)); // True
		System.out.println(name3.contains(name4)); // false
		System.out.println(name3.contains("SAK")); // false
		//equals() true/False - Case sensitive, used to compare to strings
		String name6 = "sakleshpur";
		System.out.println(name3.equals(name5)); //True
		System.out.println(name5.equals(name6));  //false - case sensitive
		//equalsIgnoreCase() true/False - NOT Case sensitive, used to compare to strings
		System.out.println(name3.equalsIgnoreCase(name5)); //True
		System.out.println(name5.equalsIgnoreCase(name6));  //True - NOT case sensitive
		System.out.println(name3.equalsIgnoreCase("Hassan")); //False not match two string
		//replace() - it will replace single or multiple string / or sequence of strings.
		String name7 = "Welcome to Selenium  Java Selenium python C#";
		System.out.println(name7);
		System.out.println(name7.replace('e', 'X'));
		System.out.println(name7.replace("Selenium", "Playwrite"));
		//substring() - it will extract string from the main string.
		//String start point start from 0,1,2,3...
		//String End point start from 1,2,3,4...
		String name8 = "Welcome";
		System.out.println(name8.substring(0,3));  //wel
		System.out.println(name8.substring(3,7)); //come
		System.out.println(name8.substring(3,4)); // c
		String name9 = "welcome";
		// toUpperCase()  
		System.out.println(name9.toUpperCase());
		//toLowerCase
		String name10 = "WELCOME";
		System.out.println(name10.toLowerCase());
		//Split() - This will split string multiple piece based on delimiters (@,- . space)
		String name11= "abcdefg@gmail.com";
		String a[] = name11.split("@"); //a[0] - abcdefg, a[1] - gmail.com
		System.out.println(a[0]); //abcdefg
		System.out.println(a[1]); //gmail.com
		System.out.println(Arrays.toString(a)); //anther way to retrun arrays results Both(a[0],a[1]) - [abcdefg, gmail.com]
		
		System.out.println(a[1]);
		String m[] = a[1].replace(".",",").split(","); //when we have "." we need to replace some other symbol, we cannot directly split with "."
		System.out.println(Arrays.toString(m));  //[gmail, com]
		
		//split method returning Arrays.
		//ex-01 - by using replace method
		String name12= "$12,20,557";
		System.out.println(name12.replace("$","").replace("," , "")); // 1220557
		//ex-02 - by using split method
		String name13 = "abc,123@gmail";
		String b[] = name13.split(",");  //results - abc  123@gmail
		System.out.println(Arrays.toString(b)); // [abc, 123@gmail] - it will return both index values(b[0] , b[1])
		String c[] = b[1].split("@"); //123 gmail
		System.out.println(Arrays.toString(c)); // [123, gmail]
		System.out.println(b[0]);
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(b[0] + " " + c[0] + " " + c[1]); //abc 123 gmail
		//ex -03 // Space spliting.
		String name14 = "abcd 123"; //abcd,123
		String d[] = name14.split(" ");
		System.out.println(Arrays.toString(d)); // [abcd, 123]
		//ex - 04
		String name15 = "John Kenedy";
		System.out.println(name15.contains("john")); // False case sensitive
		System.out.println(name15.replace("J", "j").contains("john"));  // true
		System.out.println(name15.toLowerCase().contains("john"));  //true
	}
}
