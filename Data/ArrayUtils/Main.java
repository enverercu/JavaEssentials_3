package Data.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//Create an ArrayList from an array
		String[] stringArray = { "a", "b", "c", "d", "e" };
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList);
		
		//Check if an array contains a certain value
		String[] stringArray1 = { "a", "b", "c", "d", "e" };
		ArrayList<String> arrayList1 = new ArrayList<String>(Arrays.asList(stringArray1));
		boolean b = arrayList1.contains("a");
		System.out.println(b);
		
		//Concatenate two arrays
		int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        
        int aLen = array1.length;
        int bLen = array2.length;
        
        int[] result = new int[aLen + bLen];
        
        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);
        System.out.println(Arrays.toString(result));
        
        
        // Get the Array 
        int intArr[] = { 10, 20, 15, 22, 35 }; 
  
        // To convert the elements as List 
        System.out.println("Integer Array as List: "
                           + Arrays.asList(intArr));
        
        
        
        // Get the Array 
        int intArr1[] = { 10, 20, 15, 22, 35 }; 
  
        Arrays.sort(intArr1);
        
        for (int i:intArr1){
        	System.out.print(i + " ");
        }
  
        int intKey = 22; 
  
        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr1, intKey));
        
        
        
        //copy array
        int[] array11 = {1, 2, 3};
        int Len1 = array11.length;
        int[] array22 = Arrays.copyOfRange(array11, 0, Len1);
        System.out.println("size:" + array22.length);
        
        
        
        
	}

}
