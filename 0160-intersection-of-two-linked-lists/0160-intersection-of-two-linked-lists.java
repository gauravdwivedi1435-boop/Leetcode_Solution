/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode fast =headA;
        while(fast!=null){
            ListNode slow=headB;
            while(slow!=null){
                if(slow==fast){
                    return slow;
                }
                slow=slow.next;
            }
            fast=fast.next;
        }
        return null;
    }
}