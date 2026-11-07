class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n], suffix = new int[n], res = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                prefix[i] = nums[i];
                suffix[n-1] = nums[n-1];
            } else {
                prefix[i] = nums[i] * prefix[i-1];
                suffix[n-1-i] = nums[n-1-i] * suffix[n-i];
            }
        }

        res[0] = suffix[1];
        res[n-1] = prefix[n-2];

        for (int i = 1; i < n-1; i++) {
            res[i] = prefix[i-1] * suffix[i+1];
        }

        return res;
    }
}  
