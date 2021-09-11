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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean overflow = false;
        ListNode traversalNode = new ListNode(0);
        ListNode resultNode = traversalNode;
        int sum;
        while (l1 != null || l2 != null) {
            sum = overflow ? 1 : 0;
            overflow = false;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (sum > 9) {
                overflow = true;
                sum = sum % 10;
            }
            traversalNode.next = new ListNode(sum);
            traversalNode = traversalNode.next;
        }
        if (overflow) {
            traversalNode.next = new ListNode(1);
            traversalNode = traversalNode.next;
        }
        return resultNode.next;
    }
}