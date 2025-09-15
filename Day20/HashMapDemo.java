package Day20;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
		//Declaration.
		HashMap hm = new HashMap();  // HashMap object created & imported HashMap
		//Map hm = new HashMap(); // 'Map' is parent class, so parent class can hold child class object reference HashMap
		//HashMap <Integer, String> hm = new HashMap <Integer, String> ();  ////when you want primitive data type then we have to use wrapper class
		
		//Adding Pairs.(//Adding Elements into HashMap).
		hm.put(101, "John"); //HashMap support only "put" method to added pairs
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Scott");
		hm.put(102, "David");
		
		//Printing HashMap values.
		System.out.println("Print MashMap Values : " + hm); // {101=John, 102=David, 103=Mary, 104=Scott} //If put duplicate key then it will replace recent values of key value.
		
		//Size of HashMap elements.
		System.out.println("Size of HashMap elements : " + hm.size()); //4
		
		//Remove HashMap Pair.
		hm.remove(103);
		System.out.println("After removed pair Printing Values : " + hm); //{101=John, 102=David, 104=Scott}
		
		//Access value of the particular key.
		System.out.println(hm.get(102));  //David
		
		//Get all the key values from the HashMap.
		System.out.println("Print all HashMap Key values : " + hm.keySet()); //[101, 102, 104] by using 'keyset' method we can get all key values 
		
		//Get all the values from the HashMap.
		System.out.println("Print all HashMap values : " + hm.values()); // [John, David, Scott]
		
		//Get all the Keys and values from the HashMap.
		System.out.println("Print all HashMap Keys and values : " + hm.entrySet()); // 'entrySet' method return all the Keys & Vlaues // [101=John, 102=David, 104=Scott]
		
		//Modify elements in HashMap (Modify/Change/Update)
		//If want to update 
		//Use put method and use same key and new values
		hm.put(101, "Roshan");
		System.out.println("After modified value : " + hm); // {101=Roshan, 102=David, 104=Scott}
		
		//Reading data from HashMap
		
		//Using for each... (Enhanced for loop)
		//for(int k:hm.keySet())  // when you used wrapper class Integer, in object creation
		for (Object k : hm.keySet())
		  //for (Object k : hm.entrySet())
		{
			System.out.println(k + "  " + hm.get(k));
				//System.out.println(k);
		}
		
		System.out.println();
		//Using Iterator.
		//Iterator<Entry<Integer, String>> it = hm.entrySet().iterator(); // when you used wrapper class, in object creation
		Iterator<Entry> it = hm.entrySet().iterator();
		while (it.hasNext())
		{
			//Entry<Integer, String> entry = it.next(); //when you used wrapper class while creating Integer, String
			Entry entry = it.next();
			System.out.println(entry.getKey()+ "   " + entry.getValue());
		}
		
		//Clear Everything from HashMap.
		hm.clear();
		System.out.println("After cleared HashMap: " + hm.isEmpty()); //true
	}

}
