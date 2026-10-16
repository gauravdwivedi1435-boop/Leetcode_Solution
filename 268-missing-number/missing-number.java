class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int target=0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                target++;
            }
        }
        return target;
    }
}