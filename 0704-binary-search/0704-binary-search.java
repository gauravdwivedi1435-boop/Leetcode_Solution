class Solution {
    public int search(int[] nums, int target) {
        return RecursionBiSearch(nums,target,0,nums.length-1);
    }
    public int RecursionBiSearch(int[] arr,int target,int low,int high){
        if(low>high) return -1;
        int mid=low+high-low/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return RecursionBiSearch(arr,target,low,mid-1);
        else return RecursionBiSearch(arr,target,mid+1,high);
    }
}