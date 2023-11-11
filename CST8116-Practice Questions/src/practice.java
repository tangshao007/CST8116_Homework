import java.util.*;

public class practice {

	public static final double EPSILON = 0.05;
	private String ready; 
	
	public static void main(String[] args) {
		
	//Hey folks, here are some HARD questions to help you prep for 
	//the 8116 exam. There is no official answer sheet for them.
	//It is simply a bonus practice item to help you prepare
	//and is meant as a supplement to going over your class notes
	//and past assignments / labs / tests. 
	//It is recommended you work together on the qeustions
	// you have doubts about.
		
	//0
		//share this project on git
		//every time you complete a question 
		//by writing new code
		//make sure to push it to git
		
	//1
		
		System.out.println();
		//System.out.println(false | true && !false & true && true || !(true || false));
		//what will print?
		//true
		
	//2
		
		int m = 1;
		//System.out.println(2.0 + 2/3 - 2 * 3 % 3 + "" + 2 + m++);
		//what will print?
		//2.021
		
		
	//3
		
		int[] nums = {2, 3, -2};
		int sum = 0;
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i - 1];
			sum += nums[i];
		}
		System.out.println(sum);
		
		//what will print?
		//-6
		
		
	//4
		
		/*
		int x = 5;
		int q = 2;
		while (q % 5 != 3) {
			switch (q) {
				case 2: System.out.print(x++);
				case 1: System.out.print(q--);
				break;
				case 0: System.out.print(x);
				break;
				default:x++;
			}
			q--;
		}
		*/
		
		//what will print?	
	    //526	
	
		
	
		
	//5
		int[] ints = new int[] {5,6,7};
		int num = 2;
		myFunc(num, ints);
		/*
		for (int i = 0; i < ints.length; i ++)
			System.out.print(ints[i]);
		
		System.out.println(num);
		*/
		
		//what will print?
		//2662
		
	//6 
		
		//fill in the method called below
		/*
		 * public class EpsilonChecker{
		 * 
		 * public  static void  main(String[]args){
		     boolean  r1 = withinEpsilonOfRangeAway(2.2, 3.24, 1.0);
		     boolean  r2 = withinEpsilonOfRangeAway(2.15, 3.24, 1.0);
		     System.out.println("should be true: " +r1 +
					           "\nshould be false: "+r2);
			}
		 
		  
		  public static boolean withinEpsilonOfRangeAway(double x, double y, double range){
		    return (Math.abs(y + range - x) <= EPSILON) ||(Math.abs(y - range - x) <= EPSILON) ;
	       }
		
		}
		
		*/
		//make sure that your code respects the principles
		//of hiding, cohesion and coupling - you may have to add
		//more methods
		
	//7
		
		//create flowcharts for this
		//and the previous methods
		
		double x = 1;
		double y = 3;
		double r = 1.5;
		/*
		while (!withinEpsilonOfRangeAway(x, y, r))
			if (x > y) {
				y += 0.1;
				System.out.println("moving targets closer");
			}
			else {
				r -= 0.1;
				System.out.println("increasing range");
			}
		*/
		
	//8
		
		//create a hand trace of the above function
		
	//9

		//write a default constructor, parameterized constructor,
		//copy constructor, accessors and mutators
		//for this class
			
	//10
		
		//write a function, drawX, that takes an int
		//as a parameter and prints a diagonal cross
		// of that height, so if the parameter is 10, it prints:	
		
		/*
			+        +
			 +      + 
			  +    +  
			   +  +   
			    ++    
			    ++    
			   +  +   
			  +    +  
			 +      + 
			+        +		 
		*/	
			
	//11
		
		//create a method that takes an array as an int array as
		//an argument and populates it with numbers from 0 to 100
		/*
		int[]array11 = new int[101];
		for (int i= 0 ;i <100;i++) {
			array11[i]= i;
		}
		*/
		
	//12
		
		//create a method that takes the array from //11 as an input
		//and returns an array of indices of the lowest number in
		//the array (there may be duplicates)
		
		
	//13
		
		//clean up the method are_you_ready (see below)
		//fix all errors, be they logical or stylistic
		//call the method here
		
	//14
		
		//create a UML diagram of this class
		
	}

	public static void myFunc(int num, int[]stuff) {
		for (int i = 0; i < stuff.length; i ++)
			if (i % 2 == 0)
				stuff[i]=num;
			else
				num = stuff[i];
	}
	
	//returns true if x is within epsilon of 
	//y plus range OR y minus range
	public static boolean withinEpsilonOfRangeAway(double x, double y, double range) {
		return false;
	}
	
	//asks the user to indicate if they are ready 
	//for the exam
	//takes argument t - the number of questions done so far
	public boolean are_you_ready(int t) {
	Scanner everest = new Scanner(System.in);
	System.out.println("Are you ready for this exam?");
	String answer = everest.next();
	ready = answer;
	if (answer.toLowerCase() == "yes" && answer.toLowerCase() == "y")
	return true;
	return false;
	}
}
