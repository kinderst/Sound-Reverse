
public class ListStackNode {
	public double data;
	public ListStackNode next;
	
	public ListStackNode() {
		this(0, null);
	}
	
	public ListStackNode(double data) {
		this(data, null);
	}
	
	public ListStackNode(double data, ListStackNode next) {
		this.data = data;
		this.next = next;
	}
	
}
