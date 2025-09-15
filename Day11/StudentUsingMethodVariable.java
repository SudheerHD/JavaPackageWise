package Day11;

public class StudentUsingMethodVariable 
//Using method stored data in to variable
{
int sid;
String sname;
char sgrade;

void printStudentData()
{
	System.out.println(sid+"  "+sname+"  "+sgrade);
}

void setStudentData(int id, String name, char grade)
{
	sid=id;
	sname=name;
	sgrade=grade;
}
}
