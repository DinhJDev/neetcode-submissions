class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> hMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {            
            if (hMap.containsKey(nums[i])){
                result[0] = hMap.get(nums[i]);
                result[1] = i;
                return result;
            }

            int complimentary = target - nums[i];

            hMap.put(complimentary,i);
        }
        
        return result;
    }
}
