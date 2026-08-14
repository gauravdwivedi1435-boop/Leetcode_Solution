class Solution {
    public long sumAndMultiply(int n) {
        int sum1=sum2(n);
        long product=1;
        long original=sum1;
        long reverse_ans=reverse(n);
        long reverse_ans2=reverse(reverse_ans);
        product=reverse_ans2*sum1;

        return product;
        
    }
    public static int sum2(int n){
        if(n==0) return 0;
        return n%10+sum2(n/10);
    }
    public static long reverse(long n){
        long reverse1=0;
        while(n!=0){
            if(n%10!=0){
                reverse1=reverse1*10+n%10;
            }
            n=n/10;
        }
        return reverse1;
    }

}