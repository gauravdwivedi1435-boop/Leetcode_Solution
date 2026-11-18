class Solution {
    public int maximum69Number (int num){
        int orig=num;
        int rev=0;
        while(orig!=0){
            rev=rev*10+orig%10;
            orig=orig/10;
        }
        orig=0;
        boolean flag=false;
        while(rev!=0){
            int digit=rev%10;
            if(digit==6 && flag==false){
                flag=true;
                digit=9;
            }
            orig=orig*10+digit;
            rev=rev/10;
        }
        return orig;
    }
}