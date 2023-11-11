
public class SixEplisonChecker {

	public static final double EPSILON = 0.05;
	public static void main(String[]args){
	     boolean  r1 = withinEpsilonOfRangeAway(2.2, 3.24, 1.0);
	     boolean  r2 = withinEpsilonOfRangeAway(2.15, 3.24, 1.0);
	     System.out.println("should be true: " +r1 +
				           "\nshould be false: "+r2);
		}
	 
	    //returns true if x is within epsilon of 
		//y plus range 
	// OR y minus range
	  public static boolean withinEpsilonOfRangeAway(double x, double y, double range){
	      
		  return (Math.abs(y + range - x) <= EPSILON) ||(Math.abs(y - range - x) <= EPSILON) ;
	  }
}
