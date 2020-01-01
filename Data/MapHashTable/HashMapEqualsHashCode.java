package Data.MapHashTable;

import java.util.*;
import org.junit.*;
import org.junit.Assert.*;

 
//By default, the hashCode() and equals() methods implemented in Object class are used. 
//The default hashCode()  method gives distinct integers for distinct objects, 
//and the equals() method only returns true when two references refer to the same object.

//If the key of the HashMap is self-defined objects, then equals() and hashCode() contract need to be followed. 

//The contract between equals() and hashCode() is:
//1) If two objects are equal, then they must have the same hash code.
//2) If two objects have the same hash code, they may or may not be equal.

//TreeMap e bir custom class ý key olarak verecek isek comparable implement etmeli ve compareTo override edilip sort order
//verilmeli yoksa treemap e eklerken hata alýr.
//String key ise zaten string class ý comparable ý implement eder.

class Dog{
	private String color;
	public Dog(String color){
		this.color = color;
	}
	@Override
	public String toString(){
		return this.color + " dog";
	}
}

class Cat{
	private String color;
	public Cat(String color){
		this.color = color;
	}
	@Override
	public String toString(){
		return this.color + " cat";
	}
	@Override
	public int hashCode(){
		//return 1;
		return this.color.length();
	}
	@Override
	public boolean equals(Object o) {
		return ((Cat) o).color == this.color;
	}
}

public class HashMapEqualsHashCode {

	private static HashMap<Dog,Integer> dogMap;
	
	private static HashMap<Cat,Integer> catMap;
	
	@BeforeClass
	public static void beforeClass(){
		dogMap = new HashMap<Dog,Integer>();
		catMap = new HashMap<Cat,Integer>();
	}
	
	@Test
	public void m1(){
		Dog d1 = new Dog("red");
		Dog d2 = new Dog("white");
		Dog d3 = new Dog("white");
		
		dogMap.put(d1, 10);
		dogMap.put(d2, 20);
		dogMap.put(d3, 30);
		
		for(Map.Entry entry:dogMap.entrySet()){
			System.out.println(entry.getKey().toString() + "-" + entry.getValue());
		}
	}
	
	@Test
	public void m2(){
		Cat d1 = new Cat("red");
		Cat d2 = new Cat("white");
		Cat d3 = new Cat("white");
		
		catMap.put(d1, 10);
		catMap.put(d2, 20);
		catMap.put(d3, 30);//HashMap doesnt allow two identical elements.insert only last one.
		
		for(Map.Entry entry:catMap.entrySet()){
			System.out.println(entry.getKey().toString() + "-" + entry.getValue());
		}
	}
}
