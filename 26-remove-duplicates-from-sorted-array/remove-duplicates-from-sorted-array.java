class Solution {
    public int removeDuplicates(int[] nums) {
        int newindex=0;
        for(int i=1;i<nums.length;i++){
            if(nums[newindex]<nums[i]){
                newindex++;
                nums[newindex]=nums[i];
            }
        }
        return newindex+1;
    }
}