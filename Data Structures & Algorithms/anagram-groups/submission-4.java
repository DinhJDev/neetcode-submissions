class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hMap = new HashMap<>();

        for(String str : strs) {
            // 1. Store frequency of each letter with int[] array
            int[] alpha = new int[26];

            for (int i = 0; i < str.length(); i++) {
                alpha[str.charAt(i)-'a']++;
            }

            // 2. Build String Appending # between each letter's frequency count
            // StringBuilder sb = new StringBuilder();
            // for (int count : alpha) {
            //     sb.append('#').append(count);
            // }
            String key = Arrays.toString(alpha);

            // 3. Use sb as key to group anagrams
            hMap.putIfAbsent(key, new ArrayList<>());
            hMap.get(key).add(str);
        }

        return new ArrayList<>(hMap.values());
    }
}
