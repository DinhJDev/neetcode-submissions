class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hMap = new HashMap<>();

        for(String str : strs) {
            int[] alpha = new int[26];

            for (int i = 0; i < str.length(); i++) {
                alpha[str.charAt(i)-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int count : alpha) {
                sb.append('#').append(count);
            }

            String key = sb.toString();

            hMap.putIfAbsent(key, new ArrayList<>());

            hMap.get(key).add(str);
        }

        return new ArrayList<>(hMap.values());
    }
}
