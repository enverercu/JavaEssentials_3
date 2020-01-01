package Data.List.ArrayList;


import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {

	//List : An ordered collection (also known as a sequence)
	//Unlike sets, lists typically allow duplicate elements
	//permits all elements (including null)
	//size, listIterator, add, remove, equals,contains, get(int index), int indexOf(object), isEmpty, toArray
	//get(i):index faster

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        //employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1));//index access : constant time, size does not matter

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 4568));
        //employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John", "Doe", 4567)); //shifting the remaining array : expensive
        //employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray) {
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));//false. this is new instance.
	//for obtaining true we must override equals method in Employee class
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        employeeList.remove(2);//shifting the remaining elements to the left: expensive
        //employeeList.forEach(employee -> System.out.println(employee));

    }
}