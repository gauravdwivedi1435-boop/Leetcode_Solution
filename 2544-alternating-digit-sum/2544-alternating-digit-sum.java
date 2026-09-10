class Solution {
    public int alternateDigitSum(int n) {
        int total=0;
        int i=0;
        int reverse=0;
        while(n!=0){
            reverse=reverse*10+n%10;
            n/=10;
        }
        while(reverse!=0){
            int digit=reverse%10;
            if(i%2==0){
                total=total+reverse%10;
                i++;
            }
            else{
                total=total-reverse%10;
                i++;
            }
            reverse=reverse/10;

        }
        return total;

        
    }
}