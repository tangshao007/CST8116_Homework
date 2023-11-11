/*
 * Desciption: Lab Exercise 04 Task 2
 * Author: Wenqi Tang
 * Professor: Veda Eoukulla
 * Date:10 July
 * Due date:27 July 
 */

//represent the orange with count
public class Orange {

	private static int count;
	
	//no-argument constructor
	public Orange()
	{
		
	}
	
	// overloaded constructor accepting values for count
	public Orange(int count)
	{
		this.count = count;
	}

	// accessor for count
	public static int getCount() {
		return count;
	}
	
	// mutator for count
	public static void setCount(int count) {
		Orange.count = count;
	}
	
	
	//using switch clause to return cost per orange for different count
	public double costPerOrange()
	{
		switch(count) {
		case 163:
		case 150:
		case 138:
		case 125:
		case 113:
		case 100:
		case 88:
		case 80:
			return 10.0/ count;
		default:
			System.out.println("Invalid");
			return 0;
		}
	}
	}
	

