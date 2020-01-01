package Data.List.LinkedList;

public class LinkedListMain {
	public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(janeJones);//will be the O(1) time complexity. the same time insert 1 item or 1 million item
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();//add and remove to front do not need shifting and O(1) time complexity
        System.out.println(list.getSize());
        list.printList();

    }
}
