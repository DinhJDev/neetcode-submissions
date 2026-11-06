class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Map<Integer,Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // Decrement count
            count.put(nums[i], count.get(nums[i]) - 1);
            // Prevent duplicate lists from duplicate nums
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length; j++) {
                count.put(nums[j], count.get(nums[j]) - 1);
                // Prevent duplicate lists from duplicate nums
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // nums[i] + nums[j] + x == 0
                // nums[i] + nums[j] == -x
                // -(nums[i] + nums[j]) == x
                int target = -(nums[i] + nums[j]);

                // Check if target matches an available count from hashmap
                if (count.getOrDefault(target, 0) > 0) {
                    res.add(Arrays.asList(nums[i], nums[j], target));
                }
            }

            // Undo count decrements for next iteration
            for (int j = i + 1; j < nums.length; j++) {
                count.put(nums[j], count.get(nums[j]) + 1);
            }
        }
        return res;
    }
}
