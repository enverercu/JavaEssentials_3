package Data.Sort;

public class MergeSort {
	public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

	//NOT an in-place algorithm
	//divide and conquer algorithm
	//recursive algorithm
	//Divide the arrays into two arrays, the left array and the right array
	//keep splitting until all the arrays have only one element
	//merge every left and right pair of sibling arrays into a sorted array
	//merge until you have only one single sorted array
	//Two phases : splitting and merging
	//splitting makes the sorting faster in small peaces
	//splitting is logical. we dont create new arrays
	//merging phase we create temp arrays
	//O(nlogn) we are repeatedly dividing the array in half during the splitting phase
	//stable

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }
}
