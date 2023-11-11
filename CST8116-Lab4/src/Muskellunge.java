/*
 * Desciption: Lab Exercise 04 Task 1
 * Author: Wenqi Tang
 * Professor: Veda Eoukulla
 * Modified By:11 July
 * Due date:27 July 
 */

//represent the limit size and length
public class Muskellunge {
	private static final int LIMIT_SIZE = 137; // centimeters 
	private double length;
	
	//no-argument constructor
	public Muskellunge() {
		this(0);
	}
	
	// overloaded constructor accepting values for length
	public Muskellunge(double length) {
		this.length = length;
	}
	
	
	// accessor for length
	public double getLength() {
		return length;
	}
	
	// mutator for length
	public void setLength(double length) {
		this.length = length;//add "this" key word
	}
	
	
	// using if else clause to decide is the fish over limit or not
	public String catchReport() {
		boolean isOverLimit;
		String report;
		
		isOverLimit = length > LIMIT_SIZE;//remove "="
		
		if(isOverLimit == true) //change "=" to "=="
			{	report = "Keeper";
		}
		else {
			report = "Release";
		}
		
		return report;
	}
	
	

}
