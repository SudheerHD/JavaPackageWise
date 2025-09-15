package Day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		//Declaration.
		
		ArrayList mylist = new ArrayList();  // Arraylist object created & import ArrayList
		//List mylist = new ArrayList(); // List is parent class, so parent class can hold child class object reference ArrayLit
		//ArrayList <Integer> mylist = new ArrayList <Integer>(); //when you want primitive data type then we have to use wrapper class
		//ArrayList <String> mylist = new ArrayList <String>(); //when you want String data type then we have to use wrapper class
		//ArrayList <Employee> mylist = new ArrayList <Employee>(); //when you want store Employee class data then we have use employee class
	
		//Adding Data into ArrayList().
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//Size of an ArrayList();
		System.out.println("Size of an ArrayList :" + mylist.size()); // 8
		
		//Printing all the ArrayList items(elements).
		System.out.println("Printing Data From ArrayList : " + mylist); //[100, 10.5, Welcome, A, true, 100, null, null]
		
		//Remove elements from ArrayList();
		mylist.remove(5);
		System.out.println("After Removing elements from ArrayList : " +mylist); //[100, 10.5, Welcome, A, true, null, null]
		
		//Insert elements in the ArrayList();
		mylist.add(2, "java");
		System.out.println("After inserting elements to ArrayList : " +mylist); //[100, 10.5, java, Welcome, A, true, null, null]
		
		//Modify elements in ArrayList (Modify/Change/Update)
		mylist.set(2, "Python");
		System.out.println("After modified elements in ArrayList : " +mylist); // [100, 10.5, Python, Welcome, A, true, null, null]
		
		//Access Specific elements from ArrayList();
		System.out.println("Accessing Specific Elements from ArrayList : " + mylist.get(3)); //Welcome
		
		//Reading all the elements in the ArrayList.
		
		//Using Normal for loop.
		for(int i=0;i<mylist.size();i++)
		{
			System.out.print(mylist.get(i) + ", " ); //mylist.get(i) it will capture the index value //100, 10.5, Python, Welcome, A, true, null, null
		}
		
		//Using for each... loop (Enhanced for loop).
		System.out.println();
		for(Object o : mylist) // object variable taken because ArrayList contains all data string,integer, float
		{
			System.out.print(o  + ", " ); //100, 10.5, Python, Welcome, A, true, null, null,
		}
		
		//Using iterator method // iterator method already there in Arraylist
		System.out.println();                    // next line created because above one this one(both printed in single line) came in same line output
		Iterator it = mylist.iterator();         //Storing output from mylist to Iterator //it is not object, it is method()
		while(it.hasNext())                      //hasNext() method Check is first elements there or not?)
		{
			System.out.print(it.next() + ", " ); // next() will return the elements 
			                                     //100, 10.5, Python, Welcome, A, true, null, null,
		}
		System.out.println();
		
		//Checking ArrayList is empty or not?
		System.out.println("Is ArrayList Empty? : " +mylist.isEmpty());  //false
		
		//Remove all elements from the ArrayList(mylist) which is available in (mylist2)
		
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add("Welcome");
		System.out.println("Mylist2 elements : " + mylist2);
		
		mylist.removeAll(mylist2); // mylist elements will remove which is available elements in mylist2
		System.out.println("after removing multiple elements : " + mylist);  //[10.5, Python, A, true, null, null]
		
		//Remove the all the elements in ArrayList
		mylist.clear();
		System.out.println("After clearing Is ArrayList Empty? : " +mylist.isEmpty()); //true
	
	}

}
