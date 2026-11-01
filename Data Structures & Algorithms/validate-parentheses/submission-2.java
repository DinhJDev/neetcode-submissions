class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        Map<Character,Character> closeToOpen = new HashMap<>();
        closeToOpen.put('}','{');
        closeToOpen.put(')','(');
        closeToOpen.put(']','[');

        for (char c : s.toCharArray()) {

            // 1. Check if c is closing bracket
            if (closeToOpen.containsKey(c)) {
                // 2. Check if the last item in the stack was a opening bracket.
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    // 3. Remove the matching element
                    stack.pop();
                // Empty stack or invalid match 
                } else {
                    return false;
                }
            // Push opening brackets to stack
            } else {
                stack.push(c);
            }
        }
        // Valid if all elements have been popped after iterating through the string completely
        return stack.isEmpty();

    }
}
