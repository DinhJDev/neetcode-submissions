class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if (sArr.length != tArr.length) {
            return false;
        }

        Map<Character, Integer> hMap = new HashMap<>();

        for (char sChar : sArr) {
            hMap.put(sChar,(hMap.getOrDefault(sChar, 0) + 1));
        }

        for (char tChar : tArr) {
            hMap.put(tChar,(hMap.getOrDefault(tChar, 0) - 1));
        }

        for (int v : hMap.values()) {
            if (v != 0) return false;
        }

        return true;
    }
}
