class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max_product=Integer.MIN_VALUE;
        int max=1;
        if(nums.length==3){
            for(int i=0;i<3;i++){
                max=max*nums[i];
            }
            return max;
        }
        int neg_max=nums[0]*nums[1]*nums[nums.length-1];
         if(neg_max>max_product){
            max_product=neg_max;
        }
        
        for(int i=0;i<nums.length-2;i++){
            max=nums[i]*nums[i+1]*nums[i+2];
            if(max>max_product){
                max_product=max;
            }
        }
  
   
        
        
        return max_product;
        
    }
}