package Day10;

public class StudentMain {

	public static void main(String[] args) 
	{
	//First Object
      Student std1 = new Student();
      std1.sid = 1001;
      std1.sname = "shamson";
      std1.grad = 'A';
      std1.display();
      
      // Second Object
      System.out.println();
      
      Student std2 = new Student();
      std2.sid = 1002;
      std2.sname = "Rajendra";
      std2.grad = 'B';
      std2.display();
	}

}
