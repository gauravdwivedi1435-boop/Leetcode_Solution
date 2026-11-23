class Solution {
    public boolean checkString(String s) {
         int n=s.length();
        
        for(int i=1;i<n;i++){
            // char b=s.charAt(i-1);
            // char a=s.charAt(i);
            // if(b=='b'  && a=='a') return false;
            if(s.charAt(i-1)=='b' && s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
        
    }
}