class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int ele : arr){
            if(a.containsKey(ele)){
                int freq=a.get(ele);
                a.put(ele,freq+1);
            }
            else{
                a.put(ele,1);
            }
        }
        for(int ele:a.keySet()){
            int count=0;
            int freq=a.get(ele);
            for(int ele1:a.keySet()){
                int freq1=a.get(ele1);
                if(freq==freq1){
                    count++;
                }
            }
            if(count>1){
                return false;
            }
        }

        return true;
    }
}