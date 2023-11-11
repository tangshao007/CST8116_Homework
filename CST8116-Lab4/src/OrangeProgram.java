/*
 * Desciption: Lab Exercise 04 Task 2
 * Author: Wenqi Tang
 * Professor: Veda Eoukulla
 * Date:10 July
 * Due date:27 July 
 */

import java.util.Scanner;

//demonstrate a way to obtain cost of per orange
public class OrangeProgram {

	//entry point for the application
	public static void main(String[] args) {

		int count;

		Orange orange = new Orange();
		Scanner scanner = new Scanner(System.in);//create a new object
		
		//System.out.println(10/80);
		
		System.out.print("please input the number of orange: ");//let the user input
		count = scanner.nextInt();//using scanner to receive value that user inputed
		orange.setCount(count);//using method setCount to pass count to object
		 
		boolean result = (count == 163 || count == 150 || count == 138 || count == 125 || count == 113 || count == 100 || count == 88 || count == 80) ;
		
		// using if else clause to decide if the input is one of the ones listed 
		if(result == true  ) {
			System.out.printf("$%.3f%n",orange.costPerOrange());
		}
		else
		{
			System.out.println("the entered count is invalid instead.");
		}
		
		System.out.printf("Program by Wenqi Tang");

	}

}
