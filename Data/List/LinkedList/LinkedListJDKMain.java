package Data.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListJDKMain {
	 public static void main(String[] args) {
	        Employee janeJones = new Employee("Jane", "Jones", 123);
	        Employee johnDoe = new Employee("John", "Doe", 4567);
	        Employee marySmith = new Employee("Mary", "Smith", 22);
	        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
	        Employee billEnd = new Employee("Bill", "End", 78);

		//Note that this implementation is not synchronized. 
		//If multiple threads access a linked list concurrently, 
		//and at least one of the threads modifies the list structurally, it must be synchronized externally
		//List list = Collections.synchronizedList(new LinkedList(...));

	        LinkedList<Employee> list = new LinkedList<>();
	        list.addFirst(janeJones);
	        list.addFirst(johnDoe);
	        list.addFirst(marySmith);
	        list.addFirst(mikeWilson);

	        Iterator iter = list.iterator();
	        System.out.print("HEAD -> ");
	        while (iter.hasNext()) {
	            System.out.print(iter.next());
	            System.out.print("<=>");
	        }
	        System.out.println("null");

	        list.addLast(billEnd); // also add() method adds to the last
	        iter = list.iterator();
	        System.out.print("HEAD -> ");
	        while (iter.hasNext()) {
	            System.out.print(iter.next());
	            System.out.print("<=>");
	        }
	        System.out.println("null");

	        list.removeFirst();
	        iter = list.iterator();
	        System.out.print("HEAD -> ");
	        while (iter.hasNext()) {
	            System.out.print(iter.next());
	            System.out.print("<=>");
	        }
	        System.out.println("null");

	        list.removeLast();
	        iter = list.iterator();
	        System.out.print("HEAD -> ");
	        while (iter.hasNext()) {
	            System.out.print(iter.next());
	            System.out.print("<=>");
	        }
	        System.out.println("null");

//	        for (Employee employee: list) {
//	            System.out.println(employee);
//	        }
	    }
}
