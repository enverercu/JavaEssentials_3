package Data.List.ArrayList;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ArrayListTest {

	private static List<String> list; 
	private static List<String> newList;
	
	@BeforeClass
	public static void beforeClass(){
		
		list = new ArrayList<String>();	
	}
	
	@Before
	public void before(){
		list.clear();
		list.add("Yellow");
		list.add("Orange");
		
		System.out.println("******");
	}
	
	@Test
	public void m1(){

		System.out.println(list);
	}
	
	@Test
	public void m2(){
		
		for(String str:list){
			System.out.println(str);
		}	
	}
	
	@Test
	public void m3(){
		list.add(0, "Green");
		
		for(String str:list){
			System.out.println(str);
		}
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void m4(){
		
		assertNotNull(list.get(3));
		
	}
	
	@Test
	public void m5(){
		
		assertTrue(list.contains("Red"));
	}
	
	@Test
	public void m6(){
		
		Collections.sort(list);
		
		list.forEach(element -> System.out.println(element));
	}
	
	@Test
	public void m7(){		
		
		newList = new ArrayList<String>(list);
		
		//silly error, size does not mean capacity!!
		//newList = new ArrayList<String>(list.size());
		//Collections.copy(newList,list);
		
		for(int i=0; i<newList.size();i++){
			System.out.println(newList.get(i));
		}
	}
	
	@Test
	public void m8(){
		
		Collections.reverse(list);
		
		for(String str:list){
			System.out.println(str);
		}
		
	}
	
	@Test
	public void m9(){
		
		List<String> llist = new ArrayList<String>();
		
		llist = list.subList(0,1);
		
		System.out.println(list);
		System.out.println(llist);
	}
	
	@Test
	public void m10(){
		
		List<String> llist = new ArrayList<String>();
		
		assertEquals(list,llist);
	}
	
	@Test
	public void m11(){
		
		System.out.println(list);
		Collections.swap(list,0,1);
		System.out.println(list);
	}
	
	@Test
	public void m12(){
		
		List<String> li = new ArrayList<String>();
		List<String> lii = new ArrayList<String>();
		List<String> liAll = new ArrayList<String>();
		
		li.add("You");
		li.add("are");
		
		liAll.addAll(li);
		liAll.addAll(lii);
		
		System.out.println(liAll);
	}
	
	@Test
	public void m13(){
		//List<String> li = new ArrayList<String>();
		//List<String> lii = new ArrayList<String>();
		
		ArrayList<String> li = new ArrayList<String>(); //clone list te çalýþmaz 
		
		li.add("You");
		li.add("are");
		
		ArrayList<String> lii = (ArrayList<String>) li.clone();
		
		System.out.println(lii);
	}
	
	@Test
	public void m14(){
		assertNull(list);
	}

}
