package Data.MapHashTable;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//Iterator : Enables you to traverse through a collection in the forward direction only, for obtaining or removing elements
//ListIterator : extends Iterator, and allows bidirectional traversal of list and also allows the modification of elements.

public class General {

	public static void main(String[] args){
		
		Map<String,String> hashMap = new HashMap<String,String>();//allows null key and values
//		Non synchronized data structure will give better performance than the synchronized one
//		Fail-fast means when you try to modify the content when you are iterating thru it
//		, it will fail and throw ConcurrentModificationException.
		hashMap.put("1", "Some");
		Set keys = hashMap.keySet();
		for (Object key : keys) {
			hashMap.remove(key);
		    System.out.println("in : " + hashMap.get(key));
			hashMap.put("2", "Some"); //it will throw the ConcurrentModificationException here
		}
		Iterator iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) { 
            //System.out.println(iterator.next());
            
            Map.Entry<String, String> mapElement = (Map.Entry<String, String>)iterator.next();
            
            System.out.println(mapElement.getValue());
        }
		
		for (Map.Entry mapElement : hashMap.entrySet()) { 
            String key = (String)mapElement.getKey(); 
  
            System.out.println((String)mapElement.getValue()); 
        } 
		
//		As one of HashMap's subclasses is LinkedHashMap, so in the event that you'd want predictable iteration order
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String,String>();//ordered
//		Also if you have multiple thread accessing you HashMap then Collections.synchronizedMap() method can be leveraged
		// create a synchronized map 
        Map<String, String> synmap = Collections.synchronizedMap(hashMap);
		
		
		Hashtable<String, String> hashTable = new Hashtable<String,String>();//synchronized but slow. do not allow null key and values
//		Synchronized means only one thread can modify a hash table at one point of time. Any thread before performing an update on a hashtable will have to acquire a lock on the object while others will wait for lock to be released.
//		hashTable.put("1", null);
		hashTable.put("1", "any");
		Enumeration Keys = hashTable.keys();
		while (Keys.hasMoreElements()) {
			System.out.println(Keys.nextElement());
			hashTable.put("1", "any");  //this is ok
		}
		
		
//		Enumeration contains 2 methods namely hasMoreElements() & nextElement() whereas Iterator contains three methods namely hasNext(), next(),remove().
//		Iterator adds an optional remove operation, and has shorter method names. Using remove() we can delete the objects but Enumeration interface does not support this feature.
//		Enumeration interface is used by legacy classes. Vector.elements() & Hashtable.elements() method returns Enumeration. Iterator is returned by all Java Collections Framework classes. java.util.Collection.iterator() method returns an instance of Iterator.
//		Iterator has a remove() method while Enumeration doesn't. Enumeration acts as Read-only interface, because it has the methods only to traverse and fetch the objects, where as using Iterator we can manipulate the objects also like adding and removing the objects. 
//		So Enumeration is used when ever we want to make Collection objects as Read-only.
		
//		Collections.sort() has a input as List so it does a translation of List to array and vice versa which is an additional step while sorting.
//		So this should be used when you are trying to sort a list. 
//		Arrays.sort is for arrays so the sorting is done directly on the array. 
//		So clearly it should be used when you have a array available with you and you want to sort it.
		
//		A typical usage example would be based on a producer-consumer scenario. 
//		Note that a BlockingQueue can safely be used with multiple producers and multiple consumers
//		ArrayBlockingQueue requires you to specify the capacity of queue at the object construction time itself. Once created, the capacity cannot be increased
		
		
//		Which implementation of the List interface provides for the fastest insertion of a new element into the middle of the list?
//		ArrayList and Vector both use an array to store the elements of the list. When an element is inserted into the middle of the list the elements that follow the insertion point must be shifted to make room for the new element.
//
//		The LinkedList is implemented using a doubly linked list; an insertion requires only the updating of the links at the point of insertion. Therefore, the LinkedList allows for fast insertions and deletions.
	
//		What is the difference between ArrayList and LinkedList? (ArrayList vs LinkedList.)
//				
//		ArrayList uses primitive object array for storing objects whereas LinkedList is made up of a chain of nodes. Each node stores an element and the pointer to the next node. A singly linked list only has pointers to next. A doubly linked list has a pointer to the next and the previous element. This makes walking the list backward easier.
//		ArrayList implements the RandomAccess interface, and LinkedList does not. The commonly used ArrayList implementation uses primitive Object array for internal storage. Therefore an ArrayList is much faster than a LinkedList for random access, that is, when accessing arbitrary list elements using the get method. Note that the get method is implemented for LinkedLists, but it requires a sequential scan from the front or back of the list. This scan is very slow. For a LinkedList, there's no fast way to access the Nth element of the list.
//		Adding and deleting at the start and middle of the ArrayList is slow, because all the later elements have to be copied forward or backward. (Using System.arrayCopy()) Whereas Linked lists are faster for inserts and deletes anywhere in the list, since all you do is update a few next and previous pointers of a node.
//		Each element of a linked list (especially a doubly linked list) uses a bit more memory than its equivalent in array list, due to the need for next and previous pointers.
	
//		The Java SDK contains 2 implementations of the List interface - ArrayList and LinkedList. If you frequently add elements to the beginning of the List or iterate over the List to delete elements from its interior, you should consider using LinkedList. These operations require constant-time in a LinkedList and linear-time in an ArrayList. But you pay a big price in performance. 
//		Positional access requires linear-time in a LinkedList and constant-time in an ArrayList.
	
		
	
	}
}
