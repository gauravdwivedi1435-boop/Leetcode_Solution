class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int count=0;
        int i=n-1;
        int j=0;
        while(i>=0){
            if(s.charAt(i)!=' '){
                j=i;
                break;
            }
            i--;
        }
        while(j>=0){
            if(s.charAt(j)!=' '){
                count++;
            }
            if(s.charAt(j)==' '){
                break;
            }
            j--;

        }
        return count;
    }
}