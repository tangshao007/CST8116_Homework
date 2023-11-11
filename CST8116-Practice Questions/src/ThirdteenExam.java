import java.util.Scanner;

public class ThirdteenExam {

	public static void main(String[] args) {
		int t = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" How many questions done so far?");
		t = scanner.nextInt();
		boolean ready =  are_you_ready(t);
		System.out.println("Are you ready? "+(ready?"Yes":"No"));
	}


	
	public static boolean are_you_ready(int t) {
		Scanner everest = new Scanner(System.in);
		System.out.println("Are you ready for this exam?");
		String answer = everest.next();
		answer = answer.toLowerCase();
		if (answer.equals("yes") || answer.equals("y"))
			return true;
		else
		    return false;
		}
	}

