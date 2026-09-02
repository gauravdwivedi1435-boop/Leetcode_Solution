class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum=new int [nums.length];
        int[] RightSum=new int[nums.length];
        int i=0;
 
        while(i<nums.length /* && leftVar>0*/){
            if(i==0){
                leftSum[i]=0;
            }   
            else{
                leftSum[i]=nums[i-1]+leftSum[i-1];
            }
            i++;
        }
        
        i=nums.length-1;
        
        while(i>=0 /* && leftVar>0*/){
            if(i==nums.length-1){
                RightSum[nums.length-1]=0;
            }   
            else{
                RightSum[i]=nums[i+1]+RightSum[i+1];
            }
            i--;
        }

        for(int k=0;k<nums.length;k++){
            nums[k]= Math.abs(leftSum[k]-RightSum[k]);
        }
        return nums;
    }
}