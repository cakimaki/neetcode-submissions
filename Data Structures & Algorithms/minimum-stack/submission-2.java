class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> stackMin;
    public MinStack() {
        stack = new Stack<>();
        stackMin = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty() || val <= stackMin.peek()){
            stackMin.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        int val = stack.pop();
        if(stackMin.peek()==val){
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
