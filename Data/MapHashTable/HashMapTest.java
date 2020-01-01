package Data.MapHashTable;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class HashMapTest {

	private Map<Integer,String> map = new HashMap<Integer,String>();
	private Map<Integer,String> newMap = new HashMap<Integer,String>();
	
	private Map<String,Double> dMap = new HashMap<String,Double>();

	@Before
	public void before(){
		map.clear();
	}
	
	@Test
	public void m1(){
		map.put(1, "one");
		map.put(2, "two");
		
		newMap.putAll(map);
		
		assertEquals(newMap,map);
	}
	
	@Test
	public void m2(){
		assertTrue(map.isEmpty());
	}
	
	@Test
	public void m3(){
		map.put(1, "one");
		map.put(2, "two");
		
		assertTrue(map.containsKey(3));
	}
	
	@Test
	public void m4(){
		map.put(1, "one");
		map.put(2, "two");
		
		System.out.println(map.get(1));
	}
	
	@Test
	public void m5(){
		map.put(1, "one");
		map.put(2, "two");
		
		System.out.println(map.getOrDefault(3, "not exists"));
	}
	
	@Test
	public void m6(){
		
		dMap.put("DE", 1.2d);
		
		System.out.println(dMap.getOrDefault("TR",0d));
	}
	
	@Test
	public void m7(){
		dMap.put("DE", 1.2d);
		
		assertNotNull(dMap.get("TR"));
	}
	

}
