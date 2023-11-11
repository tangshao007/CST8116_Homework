import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
	    int fishNum;
		double fishWeight;
		
		Fishnet fishnet= new Fishnet();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of fish caught: ");
		fishNum = scanner.nextInt();

		fishnet.setFishNumber(fishNum);
		System.out.println("getFishNumber() returns: "+ fishnet.getFishNumber());
		
		
		System.out.print("Enter the average weight per fish (in kg): ");
		fishWeight = scanner.nextDouble();
		
		fishnet.setFishWeight(fishWeight);
		System.out.println("getAverageWeightPerFish returns:  "+ fishnet.getFishWeight());
	     	
		scanner.close();
		
		fishnet.calculateTotalWeight();
		System.out.println("The total estimated weight caught (in kg) is: " +fishnet.toString());
		
		
		
	
}

}