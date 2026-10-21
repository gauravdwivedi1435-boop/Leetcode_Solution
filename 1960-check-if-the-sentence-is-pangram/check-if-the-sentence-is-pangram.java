class Solution {
    public boolean checkIfPangram(String sen) {
        HashSet<Character> ans=new HashSet<>();
        int n=sen.length();
        for(int i=0;i<n;i++){
            char ch=sen.charAt(i);
            ans.add(ch);
        }
        if(ans.size()==26){
            return true;
        }
        return false;
    }
}