package Data.Stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

	//LinkedList : push to top, pull from top , single linked list
    //resize automatically with JDK push and pop methods
    //if you need resize, use LinkedList
 
    private LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) { //O(1) time complexity
        stack.push(employee);
    }

    public Employee pop() { //O(1) time complexity
        return stack.pop();
    }

    public Employee peek() {  //O(1) time complexity
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
