class Solution {
    public boolean isValid(String s) {
        
        // Stack
        Stack<Character> stack = new Stack<>(); 
        // HashMap closing/opening bracket characters as key/value pairs
        Map<Character,Character> closeToOpen = new HashMap<>();
        closeToOpen.put(']','[');
        closeToOpen.put(')','(');
        closeToOpen.put('}','{');

        // Iterate for each character in string
        for (char c : s.toCharArray()) {    
            // 1. Check character if it is closing bracket
            if (closeToOpen.containsKey(c)) {
                // 2. Check stack if empty and if top element is a match
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    // 3. Remove from top of stack if matching
                    stack.pop();
                } else {
                    return false;
                }

            } else {
                // add to Stack if opening bracket
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
