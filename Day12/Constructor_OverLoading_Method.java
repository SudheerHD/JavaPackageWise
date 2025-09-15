package Day12;

public class Constructor_OverLoading_Method 
{
	double width, height, depth;
	
	Constructor_OverLoading_Method()
	{
		//1. individually assigned variable values
		//default value
		
		/*width =0;
		height=0;
		depth=0; */
		width = height = depth = 0;
	}
		//2. With parameters
		Constructor_OverLoading_Method(double w, double h, double d)
		{
			width =w;
			height =h;
			depth =d;
		}
		//3. Taking one parameters assigned values to all variables;
		Constructor_OverLoading_Method(double len)
		{
			width = height = depth = len;
		}
		double volume()
		{
			return(width * height * depth);
		}
	}
