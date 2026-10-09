class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
for (int ele : arr) {
    freqMap.put(ele, freqMap.getOrDefault(ele, 0) + 1);
}

HashSet<Integer> freqSet = new HashSet<>(freqMap.values());
return freqSet.size() == freqMap.size();

        
    }
}