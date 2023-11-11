import static java.lang.Math.*;//import Math.*

//create class Torus
public class Torus {
	//declarations
	private double r;
	private double R;
	
	//get the number of r
	public double getTubeRadius() {
		return r;
	}
	
	//set the number of r
	public void setTubeRadius(double r) {
		this.r=r;
	}
	
	//get the number of R
	public double getRadiusOfRevolution() {
		return R;
	}
	
	//set the number of R
	public void setRadiusOfRevolution(double R) {
		this.R=R;
	}
	
	
    //method that calculate volume for the torus.
	public String caculateVolume() {
		//Math.pow(x,a)--calculate the square of x, reference:Math POW() method in Java with example (2023) GeeksforGeeks. Available at: https://www.geeksforgeeks.org/math-pow-method-in-java-with-example/ (Accessed: 07 June 2023).
		//Math.PI-- obtain a value for PI, reference:Batool, F. (1969) How to use pi in java. Available at: https://linuxhint.com/use-pi-in-java/ (Accessed: 07 June 2023).
		double result = 2 *Math.pow( Math.PI,2) * R *Math.pow(r, 2) ;
		return String.format("%.2f", result);
				

	}
}
