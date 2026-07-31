class MinStack {
    Stack<Integer> stack;
    Stack<Integer> stackMin;

    public MinStack() {
        stack = new Stack<>();
        stackMin = new Stack<>();
    }
    
    public void push(int val) {
        int pushed = stack.push(val);
        if(stackMin.isEmpty() || stackMin.peek() >= pushed){
            stackMin.push(val);
        }
    }
    
    public void pop() {
        int val = stack.pop();
        if(!stackMin.isEmpty() && stackMin.peek()==val){
            stackMin.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stackMin.peek();
    }
}
