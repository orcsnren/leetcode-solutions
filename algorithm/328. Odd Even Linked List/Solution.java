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
public class Solution {
	public ListNode oddEvenList(ListNode head) {
		if (head == null)
			return null;
		ListNode oddNode = head;
		ListNode evenNode = head.next;
		ListNode evenHeadNode = evenNode;
		while (evenNode != null && evenNode.next != null) {
			oddNode.next = evenNode.next;
			oddNode = oddNode.next;
			evenNode.next = oddNode.next;
			evenNode = evenNode.next;
		}
		oddNode.next = evenHeadNode;
		return head;
	}
}
