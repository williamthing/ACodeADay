// William Thing

package projects;

class MinStack {
    public StackNode stack;
	
	private class StackNode {
		public int data;
		public int min;
		public StackNode next;
		
		public StackNode(int n) {
			this(n, null);
		}
		
		public StackNode(int n, StackNode next) {
			this.data = n;
			if (next == null)
				this.min = n;
			else
				this.min = Math.min(n, next.min);
			this.next = next;
		}	
	}
    
    public void push(int x) {
        if (stack == null) {
        	stack = new StackNode(x);
        } else {
        	stack = new StackNode(x, stack);
        }
    }

    public void pop() {
        stack = stack.next;
    }

    public int top() {
        return stack.data;
    }

    public int getMin() {
        return stack.min;
    }
}