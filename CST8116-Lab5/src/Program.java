

/*
 * Student Name: 
 * Lab Professor: 
 * Due Date: 
 * Description: 
 */
import java.util.Scanner;

public class Program {

	/*
	 * Add programmer comments here.
	 */
	public static void main(String[] args) {
		final int ENTER_VALUES = 1;
		final int DISPLAY_REPORT = 2;
		final int RESET_VALUES = 3;
		final int EXIT_PROGRAM = 4;
		int option = 0;
		AirQualityHealthIndexRecorder aqhi = new AirQualityHealthIndexRecorder();
		
		// do while loop
		//     output menu options
		//     get user option
		//     use switch, delegate actions to AirQualityHealthIndexRecorder as needed
		// output your name at end of program

		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("1 Enter AQHI Values\n"
				+ "2 Display Report\n"
				+ "3 Reset AQHI Data\n"
				+ "4 Exit Program"
				+ "Select option: ");
		option = User.inputInteger();
		switch(option) {
		case ENTER_VALUES:
			aqhi.enterData();
			break;
		case DISPLAY_REPORT:
			aqhi.printReport();
			break;
		case RESET_VALUES:
			aqhi.resetData();
			break;
		case EXIT_PROGRAM:
			System.out.println("Program by Wenqi Tang");
			break;
		default:
			System.out.println("Invalid menu option selected");
			break;
		}
		}while(option != EXIT_PROGRAM );
		
	}

}
