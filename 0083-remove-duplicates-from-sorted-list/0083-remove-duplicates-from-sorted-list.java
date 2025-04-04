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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode prev = head;
        ListNode res = prev;
        int dup_val = -1;
        while(temp!=null){
            if(temp.val!=dup_val){
                dup_val = temp.val;
                prev = temp;
                temp= temp.next;
            }
            else{
                prev.next = prev.next.next;
                temp = temp.next;

            }

        }
        return res;
        
    }
}