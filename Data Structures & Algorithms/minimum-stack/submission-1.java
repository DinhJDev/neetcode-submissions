class MinStack {

    // One Stack with int[2]{val,min} as elements instead of two separate Stacks
    Stack<int[]> stack = new Stack<>();

    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int val) {
        if (this.stack.isEmpty()) {
            this.stack.push(new int[] {val, val});
        } else {
            if (val <= this.stack.peek()[1]) {
                this.stack.push(new int[]{val, val});
            } else {
                this.stack.push(new int[]{val, this.stack.peek()[1]});
            }
        }
    }
    
    public void pop() {
        this.stack.pop();
    }
    
    public int top() {
        return this.stack.peek()[0];
    }
    
    public int getMin() {
        return this.stack.peek()[1];
    }
}
