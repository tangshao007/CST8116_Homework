/*
 * Desciption: Lab Exercise 04 Task 1
 * Author: Wenqi Tang
 * Professor: Veda Eoukulla
 * Date:10 July
 * Modified By:11 July
 * Due date:27 July 
 */
import java.util.Scanner;


//demonstrate a fish size check way
public class FishSizeCheck {

	//entry point for the application
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Muskellunge muskie = new Muskellunge();//create a new object
		double length;
		String report;
		
		System.out.printf("%s", "Enter length: ");//let the user input
		length = keyboard.nextDouble();//using scanner to receive value that user inputed
		muskie.setLength(length);//using method setLength to pass length to object
		
		report = muskie.catchReport();//calling catchReport method
		
		System.out.printf("%s%n", report);
		System.out.printf("%s%n", "Program modified by Your Name");
		
	}

}
