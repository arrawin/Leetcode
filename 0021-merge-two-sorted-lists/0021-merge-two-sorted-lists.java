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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h1=list1;
        ListNode h2=list2;
        ListNode dummy=new ListNode(-1);
        ListNode h3=dummy;


        while(h1!=null && h2!=null){

            if(h1.val<h2.val){
            h3.next=h1;
            h1=h1.next;
        }else{
            h3.next=h2;
            h2=h2.next;
        }
         h3=h3.next;

        }

        while(h1!=null){
            h3.next=h1;
            h3=h3.next;
            h1=h1.next;
        }

         while(h2!=null){
            h3.next=h2;
             h3=h3.next;
            h2=h2.next;
        }


        return dummy.next;

        
        
    }
}
        
