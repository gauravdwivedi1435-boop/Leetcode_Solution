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
        HashSet<Integer> freqSet=new HashSet<>();
        for(int ele:a.keySet()){
            int freq=a.get(ele);
            freqSet.add(freq);

        }

        return a.size()==freqSet.size();
    }
}