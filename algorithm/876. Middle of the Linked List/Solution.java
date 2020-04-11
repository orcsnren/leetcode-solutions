/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 
 class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
 */

class Solution {
	public ListNode middleNode(ListNode head) {
		int count = 0;
		ListNode tmp = head;
		while (tmp != null) {
			count++;
			tmp = tmp.next;
		}
		int target = 0;
		if (count % 2 == 0) {
			target = (int) Math.ceil(count / 2.0);
		} else {
			target = (int) Math.ceil(count / 2);
		}

		while (target != 0) {
			head = head.next;
			target--;
		}
		return head;
	}
}