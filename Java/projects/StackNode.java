package projects;

public class StackNode {
	public int data;
	public StackNode next;
	
	public StackNode(int n) {
		this(n, null);
	}
	
	public StackNode(int n, StackNode next) {
		this.data = n;
		this.next = next;
	}
}
