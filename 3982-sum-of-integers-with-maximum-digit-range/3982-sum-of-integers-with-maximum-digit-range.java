class Solution {
    public int maxDigitRange(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int max_value=0;
        int[] arr=new int [n];
        //finding digit range of each element
        for(int i=0;i<n;i++){
            int max1=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            int temp=nums[i];
            while(temp!=0){
                int digit=temp%10;
                if(min>digit){
                    min=digit;
                }
                if(max1<digit){
                    max1=digit;
                }
                temp=temp/10;
            }
            arr[i]=max1-min;
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

}