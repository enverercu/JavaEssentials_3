package Data.Sort;

public class SelectionSort {
	public static void main(String[] args) {

		//in place algorithm
		//right to left partitioned algorithm
	        //O(n2) time complexity - quadratic
	        //100 steps to sort 10 items
		// doesnt require as much swapping as bubble sort
		// 2 loops = n * n

	        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

	        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
	                lastUnsortedIndex--) {

	            int largest = 0;

	            for (int i = 1; i <= lastUnsortedIndex; i++) {
	                if (intArray[i] > intArray[largest]) { //unstable : can change the order of dublicate items
	                    largest = i;
	                }
	            }

	            swap(intArray, largest, lastUnsortedIndex);

	        }


	        for (int i = 0; i < intArray.length; i++) {
	            System.out.println(intArray[i]);
	        }


	    }

	    public static void swap(int[] array, int i, int j) {

	        if (i == j) {
	            return;
	        }

	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;

	    }
	    
}
