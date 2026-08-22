class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int sum1=0;
        int result=1;

    
        while(n!=0){
            result=result*(n%10);
            sum1=sum1+(n%10);
            n=n/10;
        }
        int x=sum1+result;
        
    

        if(original%x==0){
            return true;
        }

        return false; 
    }
}