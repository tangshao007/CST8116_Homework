import java.util.Scanner;

public class DiagonalCross {

	public static void main(String[] args) {
		int size = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("which size of the X do you want?");
		 size = scanner.nextInt();
		 scanner.nextLine();
		 drawX(size);
		 
	 }
		 
	public static void drawX(int height) {
		
		for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (j == i || j == height - i + 1) {
                    System.out.print("+");
                } 
                else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
		}

	}

}

	
