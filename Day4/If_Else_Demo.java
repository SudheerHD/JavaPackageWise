package Day4;

public class If_Else_Demo
{
	public static void main (String[] args)
	{
		//Person is eligible or not to VOTE.
		//int person_age=25; //person is eligible for vote
		//int person_age=17; // Person is not eligible for vote
		int person_age=18;  // person is eligible for vote
		if(person_age>=18)
		{
			System.out.println("person is eligible for vote");
		}
		else
		{
			System.out.println("Person is not eligible for vote");
		}
	}

}
