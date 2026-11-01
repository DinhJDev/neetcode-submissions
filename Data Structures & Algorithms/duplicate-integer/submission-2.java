class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> nHash = new HashSet<>();

        for (int num : nums){
            if (nHash.contains(num)) {
                return true;
            }

            nHash.add(num);
        }

        return false;
    }
}