class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap for frequency
        Map<Integer, Integer> freqMap = new HashMap<>();
 
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // List with int[] as values {count, num}
        List<int[]> freq = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            freq.add(new int[]{entry.getKey(), entry.getValue()});
        }

        // Sort with Comparator based on count (entry[0])
        freq.sort((a,b) -> b[1] - a[1] );

        // Return int[k] array with num (entry[1]) from sorted list
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = freq.get(i)[0];
        }

        return res;
    }
}
