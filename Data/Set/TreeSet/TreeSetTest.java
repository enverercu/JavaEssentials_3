package Data.Set.TreeSet;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TreeSetTest {

	TreeSet<String> tree = new TreeSet<String>();

	//A TreeSet is typically used when we want to keep the elements sorted all times.
	//duplicate values are not allowed.
	//Objects in a TreeSet are stored in a sorted and ascending order.
	
	@Test
	public void m1(){
		 tree.add("A"); 
	     tree.add("B"); 
	     tree.add("C"); 
	  
	     // Duplicates will not get insert 
	     tree.add("C");
	     
	     
	}
}
