package Data.List.DoubleLinkedList;

public class DoubleLinkedListMain {
	public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

	//advantage : head : head=null; next = next; , tail : head : previous , next = null;
	//we can operate both head and tail nodes in constant O(1) time complexity because of references
	//when inserting a node A between nodes B and C
	//Assign A's next field to B's next field
	//Assign A's previouse field C's previous field
	//Assign B's next field to A
	//Assign C's previous field to A
	//O(1) time complexity BUT we have to find the insertion position first so this is actually O(n)
	//To remove node A between B and C
	//Assign A to "removed node"
	//Assign C's previous field to A's previous field
	//Assign B's next field to A's next field
	//return A from method
	//O(1) time complexity BUT we have to find A first, so this is actually O(n)
	//when inserting or deleting from middle of linklist we have linear O(n) complexity time for connecting other next and previous

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());

    }
}
