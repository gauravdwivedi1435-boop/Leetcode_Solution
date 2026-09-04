class Solution {
    public int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public int romanToInt(String s) {
        int result = 0;

        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int currentValue = value(current);

            if (i + 1 < s.length()) {
                char next = s.charAt(i+1);
                int nextValue = value(next);

                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            }
            else {
                result += currentValue;
            }
        }
        return result;
    }
}