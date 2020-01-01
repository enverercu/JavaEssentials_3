package Data.Sort;

public class QuickSort {
	
	public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

	//divide and conquer algorithm
	//recursive algorithm
	//O(nlogn) we re repeatedly partitioning the array into two halves
	//in worst case works as n2-quadratic
	//uses a pivot element to partition the array into two parts
	//Elements<pivot is the left , elements > pivot to the right array
	//repeat splitting until each element is the pivot - 1 element arrays
	//does this in-place (unlike merge sort)
	//pivot will be the first element in the array and compare last element
	//i=start=0 ; j=end=7 ; pivot<--arr[0]; 
	//right to left j-- is smaller than pivot, move j-- element to start, if smaller next j-- element to start+1
	//left to right i++ is greater than pivot, move i++ element to end, if greater next i++ element to end-1
	//so, pivot is in the correct position, all left elements smaller than pivot and right elements bigger than pivot
	//pivot is always the first element of sibling arrays

        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }
}
