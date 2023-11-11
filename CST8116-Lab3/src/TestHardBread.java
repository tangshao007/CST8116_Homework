
public class TestHardBread {

	public static void main(String[] args) {
	
		//declaration
		double volume;
		String report;
		
		//create object
		HardBread HardBread1 = new HardBread();
		HardBread HardBread2 = new HardBread(2.5, 5.75, 3.45, true);
		
		//call method calculateVolume to calculate the volume
		volume = HardBread1.calculateVolume();
		report = HardBread1.toString();//call method toString to print length,width and depth
		System.out.println("Hard Bread 1:");
		System.out.printf("volume:%.2f %n " , volume);//format volume to 2 decimal 
		System.out.println(report);
		
		//call method calculateVolume to calculate the volume
		volume = HardBread2.calculateVolume();
		report = HardBread2.toString();//call method toString to print length,width and depth
		System.out.println("Hard Bread 2:");
		System.out.printf("volume:%.2f %n" , volume);//format volume to 2 decimal 
		System.out.println(report);
		
		System.out.println("Program by Wenqi Tang");
	}

}
