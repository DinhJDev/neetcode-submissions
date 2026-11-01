class Solution {
    public boolean isPalindrome(String s) {

        String sanitizedStr = s.replaceAll("[^a-zA-Z0-9]|\\s", "").toLowerCase();
        int left = 0;
        int right = sanitizedStr.length()-1;

        while (left < right) {
            if (sanitizedStr.charAt(left) == sanitizedStr.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
