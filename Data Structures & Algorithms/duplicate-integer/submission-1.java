class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> nMap = new HashMap<>();

        for (int num : nums) {
            if (nMap.containsKey(num)) return true;
            
            nMap.put(num, nMap.getOrDefault(num, 0) + 1);
        }

        return false;
    }
}