class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max_product=Integer.MIN_VALUE;
        int max=1;
       
        int last_max=nums[n-1]*nums[n-2]*nums[n-3];
        if(last_max>max_product){
            max_product=last_max;
        }
        int neg_max=nums[0]*nums[1]*nums[n-1];
        if(neg_max>max_product){
            max_product=neg_max;
        }

        return max_product;
        
    }
}