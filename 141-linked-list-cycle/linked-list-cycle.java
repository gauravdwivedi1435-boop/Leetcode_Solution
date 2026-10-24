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
        if(head==null){
            return false;
        }
        HashSet<ListNode> set=new HashSet<>();
        
        ListNode slow=head;
        if(slow.next==null){
            return false;
        }
        while(slow!=null){
            if(set.contains(slow)){
                return true;
            }
            set.add(slow);
    
            slow=slow.next;
            if(slow.next==null){
                return false;
            }
 
        }
        return false;
        
    }
}