package Data.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListMainOther {

	public static void main(String[] args){
		
		
		List<String> values = new ArrayList<>(
								Arrays.asList("Enver"));
		
		
		values.add("Ali");
		values.add("Veli");
		values.add("Fatma");
		values.add("Ali");
		values.add(0,"Mahmut");
		
		values.forEach(enver -> System.out.print(" " + enver));
		
		Collections.sort(values);
		
		System.out.println("\nAfter sort");
		values.forEach(enver -> System.out.print(" " + enver));
		
		Collections.reverse(values);
		System.out.println("\nAfter reverse");
		values.forEach(enver -> System.out.print(" " + enver));
		
		if (values.contains("Ali")){
			System.out.println("\nThere is Ali");
			System.out.println(values.size());
		}
		
		values.remove("Ali");//remove just first occurence
		
		System.out.println(values.size());
		
		values.set(0, "Enver");
		String value = values.get(0);
		System.out.println(value);
		
		values.remove(0);
		
		for(String arr:values){
			System.out.println("Element: " + arr);
		}
		
		int pos = values.indexOf("Enver");
		System.out.println(pos);
		
		values.clear();
		System.out.println(values.size());
		
		 
		ArrayList<Integer> intArr = new ArrayList<>(Collections.nCopies(10, 5));
		intArr.forEach(ayy -> System.out.print(ayy));
		
		System.out.println("\n");
		
		Iterator iter = intArr.iterator();
		while (iter.hasNext()){
			System.out.print(iter.next());
		}
	}
}
