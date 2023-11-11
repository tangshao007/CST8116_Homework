import java.lang.Math;
import java.util.Scanner;

//represent the rod with length
public class MetalRod {
        
	    //declaration
	    public static final double EPSILON = 0.002;
	    public static final double TARGET_LENGTH = 5.55;

	    private double length;
	    public int countWithinTolerance=0;
	    public int countTotal=0;
	    
	   //no-argument constructor
	    MetalRod(){
	    	
	    }
	    
	    // overloaded constructor accepting values for length
        MetalRod(double length){
	    	this.length = length;
	    }

        //accessor for count
		public double getLength() {
			return length;
		}

		// mutator for count
		public void setLength(double length){
			this.length = length;
		}
		
		
		//test if the user's input is double
		 public static double getValidDoubleInput(Scanner scanner) {
		        double result = 0.0;
		        boolean validInput = false;

		        System.out.print("Please enter the length of the rod in cm: ");
		        while (!validInput) {
		            String inputStr = scanner.nextLine();

		            try {
		                result = Double.parseDouble(inputStr);
		                validInput = true;
		            } catch (NumberFormatException e) {
		                System.out.println("Please enter numerical value.");
		            }
		        }

		        return result;
		    }
		 
        //decide and output if the length is within tolerance
		public String rodsWithinTolerance() {
			countTotal++;
			if(Math.abs(length - TARGET_LENGTH) <= EPSILON) {
				countWithinTolerance ++;
				return "This rod is within tolerance." ;
			}
			else {
				return "This rod is not within tolerance.";
			}
		}

		//calculate the vaild rods' percentage
	    public int tolerancePercent(){
	    	return (int)((double)countWithinTolerance/countTotal*100);
	        
	        }
	    
	   
	   
}