import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		int largeFishCount = 0;   
		int mediumFishCount = 0;
		int size;
		String option;
		
		
		Scanner scanner = new Scanner(System.in);

		
		
      do {
    	 System.out.println("Enter the size of the fish caught (1 = large, 2 = medium) :");
    	
    	size = scanner.nextInt();
    	scanner.nextLine();
         if (size ==1)
        {
       	
      	  largeFishCount++;
        }
         else
        {
        	mediumFishCount++;
        }
        //scanner.nextLine();
         System.out.println("Do you wish to exit? (Enter Y to exit, anything else to continue): ");
         
         option = scanner.nextLine();
    	
    }while(!option.equalsIgnoreCase("Y"));
    
    
    scanner.close();
    
    Fishnet fishnet = new Fishnet( largeFishCount, mediumFishCount);

 
    
    System.out.printf("The total value of the catch is $"+ fishnet.calculateValue());
    
	}

}
