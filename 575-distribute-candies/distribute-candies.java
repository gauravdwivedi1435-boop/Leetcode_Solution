class Solution {
    public int distributeCandies(int[] can) {
        HashSet<Integer> set=new HashSet<>();
        int n=can.length;
        for(int i=0;i<n;i++){
            set.add(can[i]);
        }
        int x=n/2;
        if(set.size()>=x){
            return x;
        }
        return set.size();


    }
}