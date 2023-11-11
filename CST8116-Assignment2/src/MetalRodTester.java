import java.util.Scanner;
public class MetalRodTester {

	//demonstrate a way to test the length of the rod
	public static void main(String[] args) {
        //declaration
		double length;
		String wish;
	    
		
		MetalRod metalrod = new MetalRod();//create new object
		Scanner scanner = new Scanner(System.in);
        
		//use do while to repeat the program
		do {
			
			//test length and make sure only input the valid input like double
			metalrod.setLength(metalrod.getValidDoubleInput(scanner));
			
			
			System.out.println(metalrod.rodsWithinTolerance());//output if the rod is within tolerance
			System.out.println(metalrod.tolerancePercent() //calculate the vaild rods' percentage
					+"% of rods entered so far have been within tolerance.");
			
		
			System.out.println("Do you wish to continue? (y/n)");
			wish = scanner.nextLine();
			
			if(!wish.equals("y")) {
				System.out.println("Goodbye.");
				System.out.println("Program by Wenqi Tang");
			};//end if user's input is not why
			
		}while(wish.equals("y"));//continue when user input "y"
		
		scanner.close();

	}

}
