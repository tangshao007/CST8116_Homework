/*
 * Assessment: Assignment01
Student Name: Wenqi Tang
Lab Professor Name: Veda Eoukulla
Lab Section Number: 343
Due Date: June 9
 */

import java.util.Scanner;//import scanner

public class Program {

	//main method for calculating the volume of torus
	public static void main(String[] args) {
		// Variable declarations
	  double innerRadius;
	  double outerRadius;
	  
	  Torus torus = new Torus(); //create new object
	  
	  String report;
	  
	  Scanner scanner = new Scanner(System.in);
	  
	  //input inner radius
	  System.out.println("please input inner radius:");
	  innerRadius = scanner.nextDouble();
	  
	  //input outer radius
	  System.out.println("please input outter radius:");
	  outerRadius = scanner.nextDouble();
	 
	 //calculate r and R
	  double r = (outerRadius - innerRadius)/2;
	  double R = (outerRadius + innerRadius)/2;
	  
	  //set r and R
	  torus.setTubeRadius(r);
	  torus.setRadiusOfRevolution(R);
	  
	 //close the running scanner
	  scanner.close();
	  
	  
	 // Generate report 
	  report = torus.caculateVolume();
	  
	 // Output the report
	  System.out.println(report);
	  System.out.println("Program by Wenqi Tang");

	}

}
