package Data.List.ArrayListConversion;

import java.util.*;

public class IntArrayToArrayList {

	public static void main(String[] args){
		
		int[] ints = {1, 2, 3};//primitive
		List<Integer> intList = new ArrayList<Integer>(ints.length);
		for (int i : ints)
		{
		    intList.add(i);
		}
	}
}
