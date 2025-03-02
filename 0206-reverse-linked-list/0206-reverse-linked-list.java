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
}