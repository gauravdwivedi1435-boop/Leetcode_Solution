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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {

        int carry=0;
        ListNode l1=list1;
        ListNode l2=list2;
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(l1!=null & l2!=null){
            int sum=l1.val+l2.val+carry;
            if(sum<10){
                ListNode temp=new ListNode(sum);
                curr.next=temp;
                curr=temp;
                if(carry>0){
                    carry--;
                }
            }
            else{
                ListNode temp=new ListNode(sum%10);
                carry=1;
                curr.next=temp;
                curr=temp;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=l1.val+carry;
            ListNode temp=new ListNode(sum%10);
            curr.next=temp;
            curr=temp;
            if(sum>9){
                carry=1;
            }
            if(carry>0 && sum<10){
                carry--;
            }
            l1=l1.next;
        }
        while(l2!=null){
            int sum=l2.val+carry;
            ListNode temp=new ListNode(sum%10);
            curr.next=temp;
            curr=temp;
            if(sum>9){
                carry=1;
            }
            if(carry>0 && sum<10){
                carry--;
            }
            l2=l2.next;
        }
        if(carry>0){
            ListNode temp=new ListNode(1);
            curr.next=temp;
            curr=temp;
        }

        return dummy.next;

    

    }
}