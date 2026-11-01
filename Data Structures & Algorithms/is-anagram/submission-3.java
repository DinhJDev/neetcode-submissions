class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if (sArr.length != tArr.length) {
            return false;
        }

        Map<Character, Integer> hMap = new HashMap<>();

        // for (char sChar : sArr) {
        //     hMap.put(sChar,(hMap.getOrDefault(sChar, 0) + 1));
        // }

        // for (char tChar : tArr) {
        //     hMap.put(tChar,(hMap.getOrDefault(tChar, 0) - 1));
        // }

        for (int i = 0; i < sArr.length; i++) {
            hMap.put(sArr[i],(hMap.getOrDefault(sArr[i], 0) + 1));
            hMap.put(tArr[i],(hMap.getOrDefault(tArr[i], 0) - 1));
        }

        for (int v : hMap.values()) {
            if (v != 0) return false;
        }

        return true;
    }
}
