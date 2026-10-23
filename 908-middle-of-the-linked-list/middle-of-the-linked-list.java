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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        ListNode curr=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
            if(len%2==0){
                curr=curr.next;
            }
        }
        
        return curr;
    }
}
