package Data.Sort;

public class CountingSort {

	public static void main(String[] args) {
        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };

	//counts the number of occurrences of each value
	//doesnt use comparisons
	//works with non-negative numbers
	//NOT an in-place algorithm. same size count array has been created to hold the occurence counts
	//O(n) but with a specific range of arrays	

        countingSort(intArray, 1, 10);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void countingSort(int[] input, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }

    }
}
