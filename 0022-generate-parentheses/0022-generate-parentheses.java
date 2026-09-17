class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate(n,ans,0,0,"");
        return ans;
    }
    public static void generate(int n,List<String> ans,int left,int right,String s){
        if(s.length()==2*n){
             ans.add(s);
             return;
        }
        if(left<n) { generate(n,ans,left+1,right,s+'('); }
        if(right<left) { generate(n,ans,left,right+1,s+')');}
    }
}