/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
	public boolean hasCycle(ListNode head) {
		Set<ListNode> nodeSet = new HashSet<>();
		while (head != null) {
			if (nodeSet.contains(head))
				return true;

			nodeSet.add(head);
			head = head.next;
		}
		return false;
	}
}

//alternative Floyd's Cycle algoritm
/*  public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
        
    }
    
*/
