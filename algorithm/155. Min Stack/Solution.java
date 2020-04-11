class Node {
	int val;
	int min;

	public Node(int val, int min) {
		this.val = val;
		this.min = min;
	}
}

class MinStack {

	Stack<Node> st;

	public MinStack() {
		st = new Stack<Node>();
	}

	public void push(int x) {
		if (st.isEmpty()) {
			st.push(new Node(x, x));
		} else {
			Node peek = st.peek();
			st.push(new Node(x, Math.min(peek.min, x)));
		}
	}

	public void pop() {
		st.pop();
	}

	public int top() {
		return st.peek().val;
	}

	public int getMin() {
		return st.peek().min;

	}
}