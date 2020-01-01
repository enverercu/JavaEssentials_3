package Data.Sort;

public class ShellSort {

	public static void main(String[] args) {

		//in place algorithm
		//left to right partitioned algorithm
		//compare neighbours with n-->n/2,... distance. n=1 works as insertion sort
	        //worst case:O(n2) time complexity - but it can perform much better than that
	        //100 steps to sort 10 items
		// doesnt require as much shifting as insertion, so it usually perform better.
		// 2 loops = n * n
		//Unstable algorithm

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

	        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {


	            for (int i = gap; i < intArray.length; i++) {
	                int newElement = intArray[i];

	                int j = i;

	                while (j >= gap && intArray[j - gap] > newElement) {
	                    intArray[j] = intArray[j - gap];
	                    j -= gap;
	                }

	                intArray[j] = newElement;


	            }

	        }

	        for (int i = 0; i < intArray.length; i++) {
	            System.out.println(intArray[i]);
	        }
	    }
}
