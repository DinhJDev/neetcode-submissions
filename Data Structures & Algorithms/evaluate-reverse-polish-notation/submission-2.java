class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<String> total = new Stack<>();
        int x, y;

        for (String token : tokens) {
            if (total.isEmpty()) {
                total.push(token);
            } else {
                switch (token) {
                    case "+":
                        y = Integer.parseInt(total.pop());
                        x = Integer.parseInt(total.pop());
                        total.push(Integer.toString(x + y));
                        break;
                    case "-":
                        y = Integer.parseInt(total.pop());
                        x = Integer.parseInt(total.pop());
                        total.push(Integer.toString(x - y));
                        break;
                    case "*":
                        y = Integer.parseInt(total.pop());
                        x = Integer.parseInt(total.pop());
                        total.push(Integer.toString(x * y));
                        break;
                    case "/":
                        y = Integer.parseInt(total.pop());
                        x = Integer.parseInt(total.pop());
                        total.push(Integer.toString(x / y));
                        break;
                    default:
                        total.push(token);
                        break;
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
