/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
	List<Node> list;

	public Node connect(Node root) {
		if (root == null) {
			return root;
		}
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(root);

		list = new ArrayList<>();
		Node temp;

		while (!queue.isEmpty()) {
			temp = queue.poll();
			list.add(temp);
			if (temp.left != null) {
				queue.add(temp.left);
			}

			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
		int nullIndex = 1;
		for (int i = 0; i < list.size() - 1; i++) {
			if (nullIndex - 1 == i) {
				list.get(i).next = null;
				nullIndex = (nullIndex * 2) + 1;
			} else {
				list.get(i).next = list.get(i + 1);
			}
		}
		list.get(list.size() - 1).next = null;

		return root;
	}
}

/* Recursion solution

public void connect(TreeLinkNode root) {
    if(root == null)
        return;
        
    if(root.left != null){
        root.left.next = root.right;
        if(root.next != null)
            root.right.next = root.next.left;
    }
    
    connect(root.left);
    connect(root.right);
}

*/

