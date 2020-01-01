package Data.Set.HashSet;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class HashSetTest {

	//HashSet stores the elements by using a mechanism called hashing.
	//HashSet contains unique elements only.
	//HashSet allows null value.
	//HashSet doesn't maintain the insertion order.
	
	 HashSet<String> set = new HashSet<String>();
	 
	 @Test
	 public void m1(){
		 set.add("1");
		 set.add("1");
		 set.add("2");
		 
		 System.out.println(set);
	 }
	
}
