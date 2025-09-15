package Day11;

public class StudentUsingMethodVariableMainMethod 
{

	public static void main(String[] args) 
	{
		//Using method stored data in to variable
		StudentUsingMethodVariable std = new StudentUsingMethodVariable ();
		std.setStudentData(102,"Robert",'B');
		std.printStudentData();
	}

}
