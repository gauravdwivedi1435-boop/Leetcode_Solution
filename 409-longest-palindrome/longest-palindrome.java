
class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i),
                map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        boolean odd = false;
        for (char num : map.keySet()) {
            if (map.get(num) % 2 == 0) {
                count += map.get(num);
            } else {
                count += map.get(num) - 1;
                odd = true;
            }
        }
        if (odd) {
            count++;
        }
        return count;
    }
}
