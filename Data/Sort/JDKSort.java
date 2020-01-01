package Data.Sort;

import java.util.Arrays;

public class JDKSort {
	
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        //Arrays.sort(intArray); //act as modified quicksort
	Arrays.parallelSort(intArray);//sort with subarrays, most cases faster

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
