package Day11;

public class ConstructorClass 
{
		int sid;
		String sname;
		char sgrade;

		void printStudentData()
		{
			System.out.println(sid +"  "+sname+"  "+sgrade);
		}

		ConstructorClass(int id, String name, char grade)
		{
			sid=id;
			sname=name;
			sgrade=grade;
		}
}
