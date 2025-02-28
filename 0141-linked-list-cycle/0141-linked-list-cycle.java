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
        if (head == null || head.next == null) {
            return false; // No cycle in an empty or single-node list
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) { // Ensure fast is not null before accessing fast.next
            slow = slow.next;
            fast = fast.next.next; 
            
            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        
        return false; // No cycle detected
    }
}
