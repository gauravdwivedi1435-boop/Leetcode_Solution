class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int i=n-1;
        while(i>=0){
            if(s.charAt(i)!=' '){
                n=i;
                break;
            }
            i--;
        }
        i=0;
        while(n>=0){
            if(s.charAt(n)!=' '){
                i++;
            }
            if(s.charAt(n)==' '){
                break;
            }
            n--;

        }
        return i;
    }
}