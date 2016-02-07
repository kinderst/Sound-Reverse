import java.util.EmptyStackException;

public class ListStack implements DStack {
	private ListStackNode front;
	
	public ListStack() {
		front = null;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public void push(double d) {
		front = new ListStackNode(d, front);
	}

	public double pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		double data = front.data;
		front = front.next;
		return data;
	}

	public double peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return front.data;
	}
}
