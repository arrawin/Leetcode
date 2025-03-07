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
    private ListNode reverseList(ListNode head) {
        if( head == null || head.next == null)
        {
            return head;
        }
        ListNode curNode;
        ListNode prevNode;
        ListNode nextNode;
        curNode = head;
        prevNode = null;
        nextNode = curNode.next;
        while(curNode != null)
        {
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
            if(nextNode != null){
            nextNode = nextNode.next;
            }
        } 
        return prevNode;
    }

    public boolean isPalindrome(ListNode head) {
       ListNode fast = head;;
       ListNode slow = head;;
       while(fast!=null && fast.next!=null)
       {
        fast = fast.next.next;
        slow = slow.next;
       }
       ListNode second_part = reverseList(slow);
       ListNode first_part = head;
       while(second_part!=null)
       {
        if(first_part.val == second_part.val){
            second_part = second_part.next;
            first_part = first_part.next;
        }
        else{
            return false;
        }
       }
       return true;
       
    }
}