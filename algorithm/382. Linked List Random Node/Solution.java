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

	/**
	 * @param head The linked list's head. Note that the head is guaranteed to be
	 *             not null, so it contains at least one node.
	 */
	List<Integer> list = null;

	public Solution(ListNode head) {
		list = new ArrayList<Integer>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}

	}

	/** Returns a random node's value. */
	public int getRandom() {
		return list.get(new Random().nextInt(list.size()));
	}
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */