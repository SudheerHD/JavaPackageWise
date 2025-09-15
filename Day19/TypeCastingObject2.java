package Day19;

// Cat ct = (Cat) an;
// A    B     C    D

class Animal {}

class Dog extends Animal {}
class Cat extends Animal {}

public class TypeCastingObject2 
{
	public static void main(String[] args) 
	{
		// Rule 1 : conversion is valid or not
		// The type of 'D' and 'C' must have relationship (either parent to child or child to parent)
		
		//Animal an = new Dog();
		//Cat ct = (Cat) an ; // Valid as per rule 1
		
		//Dog dg = new Dog();
		//Cat ct = (Cat) dg; // invalid as per rule 1, no relationship there are not either parent to child or child to parent 
		
		//Rule 2 : Assignment is valid or not
		// 'C' must be either same or child of 'A'
		
		//Animal an = new Dog();
		//Cat ct = (Cat) an; // Valid as per rule 2
		
		//Animal an = new Dog();
		//Cat ct = (Dog) an; // in valid as per rule 2 Cat and dog not same and Dog is not child of A
		
		//Rule 3
		//The underlying object type of 'D' must be either same or child of 'C'
		
		//Animal an = new Dog();
		//Cat ct = (Cat) an ; // invalid as per rule 3, cat is not child of animal
		
		//Match all rules, (Rule 1, Rule 2, Rule 3)
		
		//Animal an = new Dog();
		//Dog dg = (Dog) an; // Rule 1 - Yes, Rule 2 - Yes, Rule -3 - Yes
		
				
	}

}
