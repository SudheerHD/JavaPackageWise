package Day10;

public class Employee 
{
	
	//Variable. - Class level variable.
		int eid;
		String ename;
		String job;
		int sal;
		
	//Methods.
		void display()
		{
			System.out.println(eid);
			System.out.println(ename);
			System.out.println(job);
			System.out.println(sal);
		}
		public static void main(String[] arg)
		{
			Employee emp1 = new Employee();
			emp1.eid = 101;
			emp1.ename = "Robert";
			emp1.job = "IT";
			emp1.sal = 10000;
			emp1.display();
			
			System.out.println("-----2nd Object created for same class-----");
			Employee emp2 = new Employee();
			emp2.eid = 102;
			emp2.ename = "Jhon";
			emp2.job = "HR";
			emp2.sal = 20000;
			emp2.display();
		}
	}
