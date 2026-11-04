import java.math.BigInteger;
import java.util.Stack;

class Solution {
    public int[] plusOne(int[] digits) {
        Stack<Integer> st = new Stack<>();
        BigInteger sum = BigInteger.ZERO; 
        
        for (int i = 0; i < digits.length; i++) {
            sum = sum.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(digits[i]));
        }
        
        sum = sum.add(BigInteger.ONE);
        int n = 0;
        
        while (!sum.equals(BigInteger.ZERO)) {
            n++;
            st.push(sum.mod(BigInteger.valueOf(10)).intValue());
            sum = sum.divide(BigInteger.valueOf(10));
        }
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = st.pop();
        }
        
        return arr;
    }
}
