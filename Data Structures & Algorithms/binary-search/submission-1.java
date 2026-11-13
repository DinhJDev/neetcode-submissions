class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {

            int m = l + (r - l) / 2;
            int v = nums[m];

            if (v == target) {
                return m;
            } else if (v > target) {
                r--;
            } else if (v < target) {
                l++;
            } 
        }

        return -1;
    }
}
