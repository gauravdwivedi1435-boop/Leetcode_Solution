import java.util.*;

class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;

        if (n >= 3) {
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            int a1 = 0, a2 = 0; // sizes of arr1 and arr2
            int i = 2;

            // First two operations
            arr1[a1] = nums[0];
            a1 = a1 + 1;
            arr2[a2] = nums[1];
            a2 = a2 + 1;

            // Distribute remaining elements
            while (i < n) {
                if (arr1[a1 - 1] > arr2[a2 - 1]) {
                    arr1[a1] = nums[i];
                    a1 = a1 + 1;
                } else {
                    arr2[a2] = nums[i];
                    a2 = a2 + 1;
                }
                i = i + 1;
            }

            // Merge arr1 and arr2 back into nums
            i = 0;
            int idx1 = 0, idx2 = 0;

            while (idx1 < a1) {
                nums[i] = arr1[idx1];
                idx1 = idx1 + 1;
                i = i + 1;
            }
            while (idx2 < a2) {
                nums[i] = arr2[idx2];
                idx2 = idx2 + 1;
                i = i + 1;
            }
        }
        return nums;
    }
}
