package Data.Collection;

import java.util.*;

public class CollectionMinMax {

	public static void main(String[] args){
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		int min = Collections.min(list);
		int max = Collections.max(list);
		
		System.out.println("min:" + min + " max:" + max);
		
	}
}
