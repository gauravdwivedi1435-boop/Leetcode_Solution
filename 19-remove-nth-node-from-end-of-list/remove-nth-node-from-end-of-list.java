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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int l=0;
        //calculate length
        while(curr!=null){
            l+=1;
            curr=curr.next;
        }
        if(l==n){
            return head.next;
        }
        int k=l-n;
        curr=head;
        //remove the node
        //first iterate till n-1 node
        for(int i=1;i<k;i++){
            curr=curr.next;
        }
        // now remove the node
        if(curr==null || curr.next==null){
            return head;
        }
        curr.next=curr.next.next;


        return head;
        
    }
}