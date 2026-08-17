class Solution {
    public boolean isThree(int n) {
        int len=0;
        if(n%2==0){
            len=n/2;
        }
        else{
            len=n/3;
        }
        int count=0;
        for(int i=2;i<len+1;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }
}