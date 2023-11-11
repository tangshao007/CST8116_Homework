public class TransitBus { 

	public static final int REGULAR = 0; // 7010 kg
	public static final int DOUBLE_DECKER = 1; // 12250 kg
	public static final int ARTICULATED = 2; // 10500 kg
	public static final int MINIBUS = 3; // 10500 kg
	public static final int UNKNOWN = 4; 

	private int type;
	private int numOfPassengers;
//   private final double MAX_ALLOWED_WEIGHT = 35000.0;

	public TransitBus() {
		this(REGULAR, 36);
	}

	public TransitBus(int type, int numOfPassengers) {
		this.type = type;
		this.numOfPassengers = numOfPassengers;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bus is a " + getBusString() + " bus, " + "and has " + numOfPassengers + " passengers " + "and weighs "
				+ calculateCurrentBusWeight() + " kg";
	}

	public int getNumOfPassengers() {
		return numOfPassengers;
	}

	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}

	public double calculateCurrentBusWeight() {
		if (getEmptyBusWeight() > 0)
			return (70 * numOfPassengers + getEmptyBusWeight());
		else
			System.out.println("Bad bus type entered");
		return 0.0;
	}

	public double getEmptyBusWeight() {
		double[] emptyBusWeights = {7010, 12250, 10500, 6500, -1.0};
		return emptyBusWeights[type];
	}

	public String getBusString() {
		String[] busTypes = {"regular", "double decker", 
				"articulated", "minibus", "unknown"};
		return busTypes[type];
	
		
	}

}
