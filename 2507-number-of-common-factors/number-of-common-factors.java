class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int big=0;
        int small=0;
        if(a>b){
            big=a;
            small=b;
        }else{
            big=b;
            small=a;
        }
        for(int i=1;i<=small;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }

        return count;
    }
}