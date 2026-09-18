class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int j=n-1;
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }
            if(nums[i]==1){
                one++;
            }
            if(nums[i]==2){
                two++;
            }
        }
        for(int i=0;i<zero;i++){
            nums[i]=0;
        }
        for(int i=zero;i<zero+one;i++){
            nums[i]=1;
        }
        for(int i=zero+one;i<zero+one+two;i++){
            nums[i]=2;
        }
        
    }
}