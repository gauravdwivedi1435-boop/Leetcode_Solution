class Solution {
    public long[] sumOfThree(long num) {
        long[] ans=new long[3];
        long[] ans1=new long[0];
        

        if(num%3!=0){
            return ans1;
        }
        else{
            long n=num/3;
            ans[0]=n-1;
            ans[1]=n;
            ans[2]=n+1;
        }
        return ans;
        
    }
}