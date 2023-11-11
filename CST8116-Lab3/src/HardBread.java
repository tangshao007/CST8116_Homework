
public class HardBread {
	
	//declarations
	public static double Max_Length = 10.5;
	public static double Max_Width = 10.5;
	public static double Max_Depth = 5.5;
	private double length;
	private double width;
	private double depth;
	private boolean isSalted;
	
	private double volume;
	
	//constructor 1 
	public HardBread() {
	    length = Max_Length;
		width = Max_Width;
		depth = Max_Depth;
		isSalted = true;
		
	}
	
	//constructor 2
	public HardBread(double length, double width, double depth, boolean isSalted) {
		this.length = length;
		this.width = width;
		this.depth = depth;
		this.isSalted = isSalted;
		
	}
    
	//getters and setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public boolean isSalted() {
		return isSalted;
		
	}
 
	public void setIsSalted(boolean isSalted) {
		this.isSalted = isSalted;
	}
	
	//calculate volume work method
	public double calculateVolume() {
	
		return  volume = length*width*depth;
	}
	
	//use toString method to format output
	public String toString() {
		return String.format("Length%.2f, Width%.2f, Depth%.2f", length, width, depth);
	}
	
}
