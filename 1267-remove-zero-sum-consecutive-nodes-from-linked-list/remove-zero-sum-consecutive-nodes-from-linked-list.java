class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;

        while (temp != null) {
            if (temp.val == 0) {
                temp = temp.next;
                continue;
            }

            st.push(temp.val);
            int suffixSum = 0;

            for (int i = st.size() - 1; i >= 0; i--) {
                suffixSum += st.get(i);
                
                if (suffixSum == 0) {
                    while (st.size() > i) {
                        st.pop();
                    }
                    break;
                }
            }
            temp = temp.next;
        }

        ListNode dummy = new ListNode(-1001);
        ListNode curr = dummy;
        while (st.size() != 0) {
            ListNode temp1 = new ListNode(st.pop());
            if (dummy.next == null) {
                dummy.next = temp1;
                curr = temp1;
            } else {
                temp1.next = curr;
                curr = temp1;
                dummy.next = temp1;
            }
        }

        return dummy.next;
    }
}
