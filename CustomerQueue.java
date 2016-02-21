public class CustomerQueue{

	private Customer first, last;

	public CustomerQueue(){

		first = last = null;
	}

	public boolean isEmpty(){

		return first == null;
	}

	public void enqueue(Customer c){

		if(isEmpty()){
			first = last = c;
		}
		else{
			last.setNext(c);
			last = c;
		}
	}

	public Customer dequeue(){

		if(isEmpty()){

			return null;
		}

		Customer c = first;

		first = first.getNext();

		if(first == null){

			last = null;
		}

		return c;
	}

	public void examineQueue(){

		Customer c = first;

		while(c != null){

			System.out.println(c);

			c = c.getNext();
		}

	}
}