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
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode newList=new ListNode(1);
        ListNode head1=newList;
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        while(temp1!=null && temp2!=null){//misttak
            if(temp1.val<=temp2.val){
                newList.next=temp1;
                temp1=temp1.next;
            }
            else{
                   newList.next=temp2;
                   temp2=temp2.next;
                }
            newList=newList.next;//mistake     
        }
        if(temp1!=null){
            newList.next=temp1;
        }
        if(temp2!=null){
            newList.next=temp2;
        }
        
        return head1.next;
        

    }   
}
