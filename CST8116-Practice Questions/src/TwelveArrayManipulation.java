
public class TwelveArrayManipulation {

	public static int[] findLowestIndices(int[] arr) {
        // First, find the lowest number in the array
        int lowest = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < lowest) {
                lowest = num;
            }
        }

        // Now, count how many times the lowest number appears
        int count = 0;
        for (int num : arr) {
            if (num == lowest) {
                count++;
            }
        }

        // Finally, record the indices of all occurrences of the lowest number
        int[] indices = new int[count];
        int indexCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == lowest) {
                indices[indexCount++] = i;
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        int[] array = new int[101];
        populateArray(array);

        int[] indicesOfLowest = findLowestIndices(array);

        System.out.println("Indices of lowest value(s):");
        for (int index : indicesOfLowest) {
            System.out.print(index + " ");
        }
    }
    
    public static void populateArray(int[] array) {
        for (int i = 0; i <= 100; i++) {
            array[i] = i;
        }
    }
	
}
