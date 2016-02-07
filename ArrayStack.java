import java.util.EmptyStackException;

public class ArrayStack implements DStack {
	private double[] theArray;
	private int topOfStack;

	public ArrayStack() {
		theArray = new double[10];
		topOfStack = -1;
	}
	
	public boolean isEmpty() {
		return (topOfStack == -1);
	}

	public void push(double d) {
		topOfStack++;
		if (topOfStack == theArray.length) {
			double[] tempArray = new double[theArray.length * 2];
			for (int i = 0; i < theArray.length; i++) {
				tempArray[i] = theArray[i];
			}
			theArray = tempArray;
		}
		theArray[topOfStack] = d;
		System.out.println(theArray.length);
	}

	public double pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		topOfStack--;
		return theArray[topOfStack + 1];
	}

	public double peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return theArray[topOfStack];
	}

}
