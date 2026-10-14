class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        HashSet<Integer> arr=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        int n=arr.size();
        int j=0;
        for(int ele : arr){
            nums[j]=ele;
            j++;
        }
        //now sort 
        for(int i=0;i<n-1;i++){
            for(int l=0;l<n-1;l++){
                
                if(nums[l]>nums[l+1]){
                    int temp=nums[l];
                    nums[l]=nums[l+1];
                    nums[l+1]=temp;
                }
            }
        }

        return n;
        
    }
}