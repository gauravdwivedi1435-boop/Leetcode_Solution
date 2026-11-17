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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        int n=arr.size()-1;
        while(temp!=null && n>=0){
            if(temp.val==arr.get(n)){
                temp=temp.next;
                n--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}