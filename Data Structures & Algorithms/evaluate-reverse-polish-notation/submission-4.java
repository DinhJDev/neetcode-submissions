class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<String> total = new Stack<>();

        for (String token : tokens) {
            if (total.isEmpty()) {
                total.push(token);
            } else {
                switch (token) {
                    case "+":
                        total.push(Integer.toString(Integer.parseInt(total.pop()) + Integer.parseInt(total.pop())));
                        break;
                    case "-":
                        total.push(Integer.toString(-1*((Integer.parseInt(total.pop())) - (Integer.parseInt(total.pop())))));
                        break;
                    case "*":
                        total.push(Integer.toString(Integer.parseInt(total.pop()) * Integer.parseInt(total.pop())));
                        break;
                    case "/":
                        total.push(Integer.toString(
                            (int) (Math.pow(Integer.parseInt(total.pop()), -1) * Integer.parseInt(total.pop()))
                        ));

                        break;
                    default:
                        total.push(token);
                        break;
                }
            }
        }

        return Integer.parseInt(total.peek());
    }
}
