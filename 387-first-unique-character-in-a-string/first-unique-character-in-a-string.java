import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        HashMap<Character, Integer> arr = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (arr.containsKey(ch)) {
                int freq = arr.get(ch);
                arr.put(ch, freq + 1);
            } else {
                arr.put(ch, 1);
            }
        }
        
      
        for (int i = 0; i < n; i++) {
            if (arr.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}