import java.util.Scanner;  

public class Driver {
	static Scanner  keyboard = new Scanner(System.in);
	static final int BUS_MAX = 4;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String s; TransitBus tb;
		int type, numOfPassengers;
		TransitBus[] OCTranspoFleet = new TransitBus[BUS_MAX];
	//	do  {
		for(int busCtr = 0; busCtr < BUS_MAX; busCtr++) {
			type = busMenu();
			numOfPassengers = ValidateInput.inputInteger("Enter number of passengers");
			tb = new TransitBus(type, numOfPassengers);
			OCTranspoFleet[busCtr] = tb;
			//System.out.println(tb.toString());	
		}
		//	s = ValidateInput.inputString("Do you wish to continue? (\"yes\" to continue) ");
		//}while (s.trim().equalsIgnoreCase("yes"));
		for (int busCtr = 0; busCtr < BUS_MAX; busCtr++)
			System.out.println(OCTranspoFleet[busCtr]);
		keyboard.close();
		System.out.println("Program by Dave Houtman");
			
		}
	
	private static int busMenu() {
		int type =0 ; boolean responseIsBad;
		String menuMessage = "\nEnter the bus type \n"
				+ TransitBus.REGULAR + ". Regular \n"
				+ TransitBus.DOUBLE_DECKER+ ". Double Decker \n"
				+ TransitBus.ARTICULATED + ". Articulated \n"
				+ TransitBus.MINIBUS + ". Minibus \n";
		do {
			type = ValidateInput.inputInteger(menuMessage);	
			responseIsBad = type < TransitBus.REGULAR || type > TransitBus.MINIBUS;
			if (responseIsBad) System.out.println("Must input valid bus type\n");
		} while (responseIsBad);
		return type;
	}

}
