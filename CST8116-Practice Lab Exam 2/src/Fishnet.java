
public class Fishnet {
	   private int largeFishCount;    // count of large fish in the catch
	   private int mediumFishCount;   // count of medium fish in the catch
		
	   
	   // TODO: write the two-arg Fishnet constructor below
	   public Fishnet(int largeFishCount,int mediumFishCount) {
		   this.largeFishCount = largeFishCount;
		   this.mediumFishCount = mediumFishCount;
	   }


	   // getter for large fish count
	   public int getLargeFishCount() { return largeFishCount; }

	   // setter for large fish count
	   public void setLargeFishCount(int largeFishCount) { 
	      this.largeFishCount = largeFishCount;
	   }

	   // getter for medium fish count
	   public int getMediumFishCount() { return mediumFishCount; }

	   // setter for medium fish count
	   public void setMediumFishCount(int mediumFishCount) { 
	      this.mediumFishCount = mediumFishCount;
	   }

	   // TODO: write the calculateValue() method in the space below:
	   public double calculateValue() {
		   return largeFishCount*42.50 +  mediumFishCount*15.50;
	   }


}
