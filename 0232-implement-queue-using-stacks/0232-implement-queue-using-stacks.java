class MyQueue {
    Stack<Integer>first;
    Stack<Integer>second;
    public MyQueue() {
        first=new Stack<>();
        second=new Stack<>();
    }
    
    public void push(int x) {
        if(first.isEmpty()){
            second.add(x);
        }
        else{
            first.add(x);
        }
    }
    
    public int pop() {
        if(first.isEmpty()){
            while(!second.isEmpty()){
                first.add(second.pop());
            }
            int ans=first.pop();
            while(!first.isEmpty()){
                second.add(first.pop());
            }
            return ans;
        }
        else{
            while(!first.isEmpty()){
                second.add(first.pop());
            }
            int ans=second.pop();
            while(!second.isEmpty()){
                first.add(second.pop());
            }
            return ans;
        }
    }
    
    public int peek() {
        if(first.isEmpty()){
            while(!second.isEmpty()){
                first.add(second.pop());
            }
            int ans= first.peek();
            while(!first.isEmpty()){
                second.add(first.pop());
            }
            return ans;
        }
        else{
            while(!first.isEmpty()){
                second.add(first.pop());
            }
            int ans= second.peek();
            while(!second.isEmpty()){
                first.add(second.pop());
            }
            return ans;
        }
    }
    
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */