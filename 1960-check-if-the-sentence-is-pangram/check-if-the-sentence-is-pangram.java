class Solution {
    public boolean checkIfPangram(String sen) {
        HashMap<Character,Integer> ans=new HashMap<>();
        int n=sen.length();
        for(int i=0;i<n;i++){
            char ch=sen.charAt(i);
            if(ans.containsKey(ch)){
                int freq=ans.get(ch);
                ans.put(ch,freq+1);
            }
            else{
                ans.put(ch,1);
            }
        }
        if(ans.size()==26){
            return true;
        }
        return false;
    }
}