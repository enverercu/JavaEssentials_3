package Data.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args){
		
		int[] arr = new int[5];
		arr[0] = 111;
		arr[1] = 222;
		arr[2] = 333;
		arr[3] = 444;
		arr[4] = 555;
		
		arr = reverse(arr);
		
		for(int i:arr){
			System.out.print(" " + i);
		}
		
		arr = reverseV2(arr);
		
		System.out.println("\n");
		
		for(int i:arr){
			System.out.print(" " + i);
		}
		
		System.out.println("\n");
		
		Integer[] arr2 = new Integer[4];
		arr2[0] = 11;
		arr2[1] = 22;
		arr2[2] = 33;
		arr2[3] = 44;
		
		arr2 = reverseV3(arr2);
		
		for(Integer i:arr2){
			System.out.print(" " + i);
		}
		
	}
	
	private static int[] reverse(int[] arr){
		
		int maxIndex = arr.length -1;
		int halfIndex = arr.length / 2;
		
		for (int i = 0; i < halfIndex; i++){
			
			int temp = arr[i];			
			arr[i] = arr[maxIndex-i];			
			arr[maxIndex-i] = temp;
	
		}
		
		return arr;		
	}
	
	private static int[] reverseV2(int[] arr){
		
		ArrayList<Integer> list = new ArrayList<Integer>(arr.length); //with primitives
		for(int i:arr){
			list.add(i);
		}
		
		Collections.reverse(list);
		
		int i=0;
		for(int n:list){
			arr[i++] = n;
		}
		
		return arr;
		
	}
	
	private static Integer[] reverseV3(Integer[] arr2){
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr2));
		
		Collections.reverse(list);
		
		arr2 = list.toArray(new Integer[list.size()]);
		
		return arr2;
	}
}
