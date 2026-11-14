class Solution {
    public boolean canPlaceFlowers(int[] fd, int n) {
        int t1=n;
        int t2=n;
        int l=fd.length;
        int[] arr=new int[l+2];
        arr[0]=0 ;
        arr[n+1]=0;
        for(int i=1;i<l+1;i++){
            arr[i]=fd[i-1];
        }

        //now traverse check 3 consecutive zero start from index 1 till n-2

        for(int i=1;i<l+1;i++){
            int sum=arr[i-1]+arr[i]+arr[i+1];
            if(sum==0){
                arr[i]=1;
                n--;
            }
        }
        if(n<=0){
            return true;
        }
        return false;
    }
}