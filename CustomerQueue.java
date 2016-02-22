/*
	Program: CustomerQueue
	Professor: David Kiker
	Date: 2/29/2016
	Summary: Creates a queue of Customers to be used to simulate a grocery store line.
	Functionality: 
		Constructor: Initializes first and last pointers to null. Initializes queue size to zero.
		Public Methods: isEmpty, addCustomer, removeCustomer, getSize, getFirst
*/
		
public class CustomerQueue{

	private Customer first, last;
	private int lineSize; // Size of the line of customers.

	//Constructor
	public CustomerQueue(){

		first = last = null;
		lineSize = 0;
	}

	// Checks to see if the line is empty, if so it returns true.
	public boolean isEmpty(){

		return first == null;
	}

	// Adds customers to the queue.
	public void addCustomer(Customer c){

		if(isEmpty()){ // If the queue is empty, the new customer becomes the first and last element of the queue.
			first = last = c;
			lineSize++; // Queue size is incremented.
		}
		else{ // If the queue is not empty, the new customer becomes the last element.
			last.setNext(c);
			last = c;
			lineSize++; // Queue size is incremented.
		}
	}

	// Removes customers from the queue.
	public Customer removeCustomer(){

		if(isEmpty()){ // If the queue is empty, null is returned since no customer can be removed.
			return null;
		}

		Customer c = first;

		first = first.getNext(); // If the queue is not empty, the first element in the queue is removed and the next element becomes the first.

		lineSize--; // Queue size is decremented.

		if(first == null){ // If the first element becomes null after removing a customer from the queue, queue is now empty.
			last = null;
		}

		return c; // The next customer is returned.
	}

	// Getter for the size of the queue.
	public int getSize(){
		return lineSize;
	}
	
	// Getter for the first element in the queue.
	public Customer getFirst(){
		return first;
	}
}