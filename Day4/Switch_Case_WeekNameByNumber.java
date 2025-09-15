package Day4;

public class Switch_Case_WeekNameByNumber {

	public static void main(String[] args) 
	{
		//int weekno=1;  //Sunday
		//int weekno=4;   //Wednesady
		//int weekno=7;    //Saturday
		int weekno=9;      //Invalid week number
		
		switch(weekno)
		{
		case 1 : System.out.println("Sunday"); 
		break;
		case 2 : System.out.println("Monday"); 
		break;
		case 3 : System.out.println("Tuesday"); 
		break;
		case 4 : System.out.println("Wednesday"); 
		break;
		case 5 : System.out.println("Thursday"); 
		break;
		case 6 : System.out.println("Friday"); 
		break;
		case 7 : System.out.println("Saturday"); 
		break;
		default : System.out.println("Invalid Week number"); 
		}
	}
}
