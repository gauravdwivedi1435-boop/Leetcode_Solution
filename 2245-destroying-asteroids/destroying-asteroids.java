class Solution {
    public boolean asteroidsDestroyed(int mass, int[] as) {
        Arrays.sort(as);
        for(int i=0;i<as.length;i++){
            System.out.print(as[i]+" ");
        }
        int n=as.length;
        long sum=mass;
        for(int i=0;i<n;i++){
            if(sum>=as[i]){
                sum=sum+as[i];
            }
            else{
                return false;
            }
        }
        return true;
    }
}