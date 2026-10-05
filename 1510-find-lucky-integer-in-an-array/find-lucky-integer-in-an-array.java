class Solution {
    public int findLucky(int[] arr) {
        int max=-1;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(arr[i]==count){
                if(max<count){
                    max=count;
                }
            }
        }
        return max;
    }
}