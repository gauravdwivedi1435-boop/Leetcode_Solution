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
 //by use of fast and slow pointer

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1=head;
        ListNode p2=head;
        for(int i=0;i<n;i++){
            p2=p2.next;
        }
        //check is p2 is null , is n and List length is equal
        if(p2==null){
            head=head.next;
            return head;
        }
        // now start p1
        while(p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }

        p1.next=p1.next.next;

        return head;
    }
}