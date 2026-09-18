class Solution {
    public int maxDigitRange(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int max_value=0;
        int[] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=range(nums[i]);
        }
        //find max range
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        //finding max_Value
        for(int i=0;i<n;i++){
            if(max==arr[i]){
                max_value+=nums[i];
            }
        }
        return max_value;
        
    }
        public int range(int n){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(n!=0){
            int digit=n%10;
            if(min>digit){
                min=digit;
            }
            if(max<digit){
                max=digit;
            }
            n=n/10;
        }
        return max-min;
    }
}