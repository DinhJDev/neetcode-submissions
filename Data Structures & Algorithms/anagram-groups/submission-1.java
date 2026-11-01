class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hMap = new HashMap<>();

        for (String str : strs) {
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sortedStr = new String (strArr);
            
            if (!hMap.containsKey(sortedStr)) {
                hMap.put(sortedStr, new ArrayList<String>());
            }

            List<String> group = hMap.get(sortedStr);
            group.add(str);
        }

        return new ArrayList<>(hMap.values());
    }
}
