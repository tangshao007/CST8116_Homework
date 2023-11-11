

/*
 /*
 * Student Name: 
 * Lab Professor: 
 * Due Date: 
 * Description: 
 */

/*
 * Add programmer comments here
 */
public class AirQualityHealthIndexRecorder {
	private static final int AQHI_MAX = 10;
	private int[] values = null;
	
	/*
	 * No-argument constructor, creates an array of the size of the maximum value of
	 * Air Quality Index (AQI) to record data.
	 */
	public AirQualityHealthIndexRecorder() {
		values = new int[AQHI_MAX];
	}
	
	/*
	 * This method originally prompted the user to enter integer values between 1,
	 * i.e. min, to the max value which is based on the AQHI_MAX constant value.
	 * After each value the user was asked if they would like to enter more values
	 * (y/n). Each value is used as an index, offset by -1, in the array and for
	 * each entry the count stored in the associated element is increased by 1.
	 */
	public void enterData() {
		int input = 0;
		int min = 1;
		int max = AQHI_MAX;
		String continueDataEntry = null;
		do {
			input = User.inputInteger("Enter AQHI value: ", min, max);
			// numbers will be from 1 to AQHI_MAX, so offset by -1 as index
			// and add 1 to the value in the indexed element.
			// i.e. AQHI value 1 is stored at index 0 and so on.
			values[input - 1]++;
			continueDataEntry = User.inputString("Enter another? (y/n): ", new String[] { "y", "n" });
		}while(continueDataEntry.equalsIgnoreCase("y") );
	}
	
	
	
	/*
	 * Add programmer comments here.
	 */
	public void printReport() {
		// use a for-loop, inside a for-loop.
		// for loop to traverse the array
		//     write out the AQHI number, padded to 3 letters wide
		//     for loop to print '*' based on the number in the array element
		//     after inner-for loop output a new-line
		for(int index = 0; index < values.length; index++)
		{
			System.out.printf("%3d",index+1);
			for(int times = 0; times < values[index]; times++) {
				System.out.print("*");
				
		}
			System.out.println();
	}
		
	}
		
	
	/*
	 * This method iterates over the values array and
	 * places zero into each element.
	 */
	public void resetData() {
		for(int index = 0; index < values.length; index++) {
			values[index] = 0; // zero out each element
		}
		
		
	}
}
