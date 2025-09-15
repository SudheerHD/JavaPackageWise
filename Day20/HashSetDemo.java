package Day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo 
{

	public static void main(String[] args) 
	{
		//Declaration.
		HashSet myset = new HashSet(); // HashSet object created & import HashSet
		//Set myset = new HashSet(); // 'Set' is parent class, so parent class can hold child class object reference HashSet
		//HashSet <Integer> myset = new HashSet <Integer>(); //when you want primitive data type then we have to use wrapper class
		//HashSet <String> mylist = new HashSet <String>(); //when you want String data type then we have to use wrapper class
		//HashSet <Employee> mylist = new HashSet <Employee>(); //when you want store Employee class data then we have use employee class
			
		//Adding Elements into HashSet.
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add('A');
		myset.add(true);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//Printing Hashset values.
		System.out.println("Print HashSet Values : " + myset); //[null, A, 100, 10.5, Welcome, true]
		//Order not maintained because no index, duplication eliminated, multiple null removed, one single null returned.
		
		//Size of HashSet elements.
		System.out.println("Size of HashSet elements : " + myset.size()); // 6
		
		//Remove elements from the HashSet.
		myset.remove(10.5);  //10.5 is value (not an index, no index in HashSet)
		System.out.println("After removed elements : " + myset); // [null, A, 100, Welcome, true]
		
		//Inserting elements - is not possible because we didn’t store in order ,here we store in randomly 
		
		//Access Specific Elements.
		//Alternative way we can get the specific elements by passing values from HashSet object in to ArrayList
		//Converting HashSet ---> Into ArrayList
		
		ArrayList al = new ArrayList(myset);
		System.out.println(al); // [null, A, 100, Welcome, true]
		System.out.println("Specific Elements from HashSet : " + al.get(2)); // 100,  index 2 values will be return
		
		// Read all elements by using for each... Loop (Enhanced for loop)
		
		for(Object o : myset)  // object variable taken because ArrayList contains all data string,integer, float
		{
			System.out.println(o); // null A 100 Welcome true

		}
		
		//By using Iterator data type.
		Iterator it = myset.iterator();  ////Storing output from myset to Iterator //it is not object, it is method()
		System.out.print("By using Iterator data type : "); 
		while(it.hasNext())  //hasNext() method Check is first elements there or not?)
		{
			System.out.print(it.next() + ", ");  // null, A, 100, Welcome, true, // next() will return the elements 
		}
		
		System.out.println();  //// next line created because above one this one came in same line output
		
		// Clearing all the data from the HashSet
		myset.clear();
		System.out.println("After clearing Hashset elements : " + myset); //[]
		System.out.println("After clearing Hashset elements is Emplty? : " + myset.isEmpty());  //true
	}

}
