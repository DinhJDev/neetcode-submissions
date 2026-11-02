class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        if (this.minStack.isEmpty()) {
            this.minStack.push(val);
        } else {
            if (val <= this.minStack.peek()) {
                this.minStack.push(val);
            } else {
                this.minStack.push(this.minStack.peek());
            }
        }

        this.stack.push(val);
    }
    
    public void pop() {
        this.minStack.pop();
        this.stack.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.minStack.peek();
    }
}
