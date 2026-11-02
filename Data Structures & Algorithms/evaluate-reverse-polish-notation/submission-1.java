class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<String> total = new Stack<>();

        for (String token : tokens) {
            if (total.isEmpty()) {
                total.push(token);
            } else {
                if ("+".equals(token) || "-".equals(token) 
                || "*".equals(token) || "/".equals(token)) {
                    // Operator should pop and peek to get both values
                    
                    total.push(operation(Integer.parseInt(total.pop()), Integer.parseInt(total.pop()),token).toString());

                } else {
                    total.push(token);
                }
            }
        }

        return Integer.parseInt(total.peek());
    }

    public Integer operation (int y, int x, String operator) {
        
        switch (operator) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
            default:
                return null;
        }
    }
}
