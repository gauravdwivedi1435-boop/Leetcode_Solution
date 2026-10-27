class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(ch);
            } else {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();    // matched pair
                } else {
                    st.push(ch); // unmatched ')'
                }
            }
        }

        return st.size();
    }
}
// class Solution {
//     public int minAddToMakeValid(String s) {
//         int count=0;
//         Stack<Character> st=new Stack<>();
//         int n=s.length();
//         for(int i=0;i<n;i++){
//             char ch=s.charAt(i);
//             if(ch=='('){
//                 st.push(ch);
//             }
//             else{
//                 if(st.size()!=0){
//                     if(st.peek()=='('){
//                         st.pop();
//                     }
//                 }
//                 else if(st.size()==0 ){
//                     st.push(ch);
//                 }
//                 else if(st.size()!=0){
//                     st.push(ch);
//                 }

//             }

//         }
//         return st.size();
//     }
// }