package Day12;

public class Polymorphism_OverLoading_MainMethod {

	public static void main(String[] args) 
	{
		Polymorphism_OverLoading_Method pom = new Polymorphism_OverLoading_Method();
		//1. no parameter and method name same.
		pom.sum(); 
		//2. with parameter and method name same.
		pom.sum(10, 20);
		//3. Number of parameter is different and method name same.
		pom.sum(10, 20, 30);
		//4. with parameter different data type and method name same.
		pom.sum(15, 30.50);
		//5. different order parameter and method name same.
		pom.sum(55.15, 20);
	}

}
