class MinStack {

    /** initialize your data structure here. */
    private class Node{
        int data;
        int min;
        Node next;

        public Node(int data,int min){
            this.data = data;
            this.min= min;
            this.next = null;
        }
    }

    Node head;


    public void push(int x) {
        if(head == null){
            head= new Node(x,x);
        }else{
            //push min on stack
            Node next = head;
            head = new Node(x,Math.min(x,next.min));
            head.next = next;
        }
    }

    public void pop() {
        if(head==null){
            return;
        }else{
            head= head.next;
        }
    }

    public int top() {
        if(head == null){
            return -1;
        }else {
            return head.data;
        }
    }

    public int getMin() {
        if(head == null){
            return -1;
        }else {
            return head.min;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */