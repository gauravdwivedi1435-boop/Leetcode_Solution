class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int a=(int) s.charAt(i);
            if(a>=97 && a<=122){
                st.push(ch);
            }
            else{
                if(st.size()!=0){
                    st.pop();
                }
            }
        }
        String s1="";
        Stack<Character> c=new Stack<>();
        while(st.size()!=0){
            c.push(st.pop());
        }
        while(c.size()!=0){
            s1=s1+c.pop();
        }
        return s1;
    }
}