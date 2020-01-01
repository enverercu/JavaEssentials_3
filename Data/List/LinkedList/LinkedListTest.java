package Data.List.LinkedList;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class LinkedListTest {

	private static List<String> list;
	private static LinkedList<String> listt;
	
	@BeforeClass
	public static void beforeClass(){
		
		list = new LinkedList<String>();
		listt = new LinkedList<String>();
	}
	
	@Before
	public void before(){
	
		System.out.println("****");
		list.clear();
		list.add("Green"); //to the end
		list.add("Yellow");
		list.add("Orange");
		
		listt.clear();
		listt.add("Car"); //to the end
		listt.add("Tree");
		listt.add("Bird");
	}
	
	@Test
	public void m1(){
		
		assertFalse(list.isEmpty());
		System.out.println(list);
		for(String str:list){
			System.out.println(str);
		}
	}
	
	@Test
	public void m2(){
		
		Iterator p = list.listIterator(1);
		while (p.hasNext()){
			System.out.println(p.next());
		}
	}
	
	@Test
	public void m3(){
		Iterator p = listt.descendingIterator();
		
		while(p.hasNext()){
			System.out.println(p.next());
		}
		
	}
	
	@Test
	public void m4(){
		list.add(0,"Black");
		list.forEach(element->System.out.println(element));
	}
	
	@Test
	public void m5(){
		listt.addFirst("House");
		listt.addLast("Chair");
		System.out.println(listt);
	}
	
	@Test
	public void m6(){
		
		list.addAll(1,listt);
		
		System.out.println(list);
	}
	
	@Test 
	public void m7(){
		Object firstElement = listt.getFirst();
		Object lastElement = listt.getLast();
		
		System.out.println(listt);
		System.out.println("first:" + firstElement + " last: " + lastElement);
	}
	
	@Test
	public void m8(){
		System.out.println(listt.get(1));
	}
	
	@Test
	public void m9(){
		System.out.println("size: " + listt.size());
		String first = listt.pop();//remove and return the first element
		System.out.println(first);
		System.out.println("size: " + listt.size());
	}
	
	@Test
	public void m10(){
		System.out.println("size: " + listt.size());
		String first = listt.peekFirst();//return the first element but does not remove!
		System.out.println(first);
		System.out.println("size: " + listt.size());
	}
	
	@Test
	public void m11(){
		assertFalse(listt.contains("Airplane"));
	}
	
	@Test
	public void m12(){
		
		ArrayList<String> arrList = new ArrayList<String>(listt);
		for(String str:arrList){
			System.out.println(str);
		}
	}
	
	@Test
	public void m13(){
		assertSame(list,listt);
	}
	
	@Test
	public void m14(){
		assertEquals(list,listt);
	}
	
	@Test
	public void m15(){
		
		List<String> list2 = new LinkedList<String>();
		list2.add("Green"); //to the end
		list2.add("Yellow");
		list2.add("Orange");
		
		assertSame(list,list2);
	}
	
	@Test
	public void m16(){
		
		List<String> list2 = new LinkedList<String>();
		list2.add("Green"); //to the end
		list2.add("Yellow");
		list2.add("Orange");
		
		assertEquals(list,list2); //linkedlist has a built-in equals method
	}
	
	@Test
	public void m17(){
		System.out.println(list);
		list.set(1,"Red");
		System.out.println(list);
	}
}
