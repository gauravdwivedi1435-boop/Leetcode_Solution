class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: Quick length check
        if (s.length() != t.length()) return false;

        // Step 2: Build frequency maps for both strings
        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> t1 = new HashMap<>();

        for (char ele : s.toCharArray()) {
            s1.put(ele, s1.getOrDefault(ele, 0) + 1);
        }
        for (char ele : t.toCharArray()) {
            t1.put(ele, t1.getOrDefault(ele, 0) + 1);
        }

        // Step 3: Compare frequencies
        for (char ele : s1.keySet()) {
            if (!t1.containsKey(ele)) return false; // character missing in t
            if (!s1.get(ele).equals(t1.get(ele))) return false; // frequency mismatch
        }

        return true; // all matched
    }
}

