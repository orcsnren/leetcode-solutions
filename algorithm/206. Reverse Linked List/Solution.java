/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	public ListNode reverseList(ListNode head) {
		Stack<ListNode> stack = new Stack<>();
		if (head == null || head.next == null) {
			return head;
		}
		while (head != null) {
			stack.push(head);
			head = head.next;
		}
		ListNode node = new ListNode();
		node = stack.pop();
		ListNode resultNode = node;
		while (!stack.isEmpty()) {
			node.next = stack.pop();
			node = node.next;
		}
		node.next = null;

		return resultNode;

	}
}