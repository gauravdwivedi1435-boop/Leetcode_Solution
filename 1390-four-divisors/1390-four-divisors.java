class Solution {
    public int sumFourDivisors(int[] nums) {
        int total = 0;
        int i = 0; // index for nums
        int j = 2; // divisor candidate (start from 2)
        int count = 2; // every number has divisors 1 and itself
        int sum = 1;   // start with 1 + num[i]
        int n = nums.length;

        while (i < n) {
            int num = nums[i];
            sum = 1 + num;
            count = 2;
            j = 2;

            while (j * j <= num) {
                if (num % j == 0) {
                    int other = num / j;
                    if (other == j) {
                        count++;
                        sum += j;
                    } else {
                        count += 2;
                        sum += j + other;
                    }
                    if (count > 4) break; // early stop
                }
                j++;
            }

            if (count == 4) total += sum;
            i++;
        }

        return total;
    }
}
