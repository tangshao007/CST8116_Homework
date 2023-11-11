
public class Fishnet {
	private int fn;
	private double fw;
	private double result;
	
	public Fishnet() {
		
	}
	
	public Fishnet(int fn,double fw) {
		//this.fishNum = fishNum;
		//this.fishWeight = fishWeight;
		this.fn = fn;
		this.fw = fw;
	}
	
	public void setFishNumber(int fishNum7) {
		this.fn = fishNum7;
	}
	
	public int getFishNumber(){
		return fn ;
	}
	
	public void setFishWeight(double fishWeight7) {
		this.fw = fishWeight7;
	}
	
	public double getFishWeight() {
		return fw;
	}
	
	
	
	public void calculateTotalWeight() {
		result = fn*fw;
		
	}

	
    public String toString() {
    	//return String.format("You caught %d fish, each weighed %.2f pounds", fn, fw) ;
    	
    	return String.format("%.2f",result );
    }
}

    
