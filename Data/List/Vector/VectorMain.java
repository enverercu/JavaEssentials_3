package Data.List.Vector;

import java.util.List;
import java.util.Vector;

public class VectorMain {
	
	public static void main(String[] args) {

		//Vector is synchronized and implements arraylist
		//If a thread-safe implementation is not needed, it is recommended to use ArrayList in place of Vector.
		//an overhead comes with Vector. background synchronized. slower implementation.

	        List<Employee> employeeList = new Vector<>();
	        employeeList.add(new Employee("Jane", "Jones", 123)); //public synchronized boolean add
	        employeeList.add(new Employee("John", "Doe", 4567));
	        employeeList.add(new Employee("Mary", "Smith", 22));
	        employeeList.add(new Employee("Mike", "Wilson", 3245));

	    }
}
