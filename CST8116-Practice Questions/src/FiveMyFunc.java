
public class FiveMyFunc {

	public static void main(String[] args) {
		int[] ints = new int[] {5,6,7};
		int num = 2;
		myFunc(num, ints);
		
		for (int i = 0; i < ints.length; i ++)
			System.out.print(ints[i]);
		
		System.out.println(num);
	}
		
		public static void myFunc(int num, int[]stuff) {
			for (int i = 0; i < stuff.length; i ++)
				if (i % 2 == 0)
					stuff[i]=num;
				else
					num = stuff[i];
		}

	

}
