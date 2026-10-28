class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> a1=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            if(a1.containsKey(temp)){
                int freq=a1.get(temp);
                a1.put(temp,freq+1);
            }
            else{
                a1.put(temp,1);
            }
        }
        HashSet<Integer> a2=new HashSet<>();
        for(int ele:a1.keySet()){
            int freq=a1.get(ele);
            a2.add(freq);
        }
        if(a1.size()==a2.size()){
            return true;
        }
        return false;
    }
}