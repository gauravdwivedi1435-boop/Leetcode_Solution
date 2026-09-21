class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int j=0;// String index pointer
        int i=1;
        int sum=0;
        while(j<n){
            int temp=123-(int)s.charAt(j);
            sum=sum+temp*i;
            i++;
            j++;
        }
        return sum;
    }
}