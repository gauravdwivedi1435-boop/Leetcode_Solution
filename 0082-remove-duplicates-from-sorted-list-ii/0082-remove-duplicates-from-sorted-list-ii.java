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
        ListNode temp=head;
        HashSet<Integer> set=new HashSet<>();
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                set.add(temp.val);
            }
            temp=temp.next;
        }
        temp=head;
        ListNode dummy=new ListNode(-101);
        dummy.next=temp;
        temp=dummy;

        while(temp!=null && temp.next!=null){
            
            if(set.contains(temp.next.val)){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
          
        }
        return dummy.next; 
    }
}