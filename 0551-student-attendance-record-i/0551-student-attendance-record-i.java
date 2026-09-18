class Solution {
    public boolean checkRecord(String s) {
        int a=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='A'){
                a++;
                if(a==2){
                    return false;
                }
            }

        }
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L'){
                l++;
                break;
            }
        }
        if(l>=1 ){
            return false; 
        }
        if(a>=2){
            return false;
        }
        return true;
        
    }
}