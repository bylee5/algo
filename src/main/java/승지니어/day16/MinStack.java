package 승지니어.day16;

import java.util.Stack;

public class MinStack {
    class Node {
        int val;
        int min;
        Node(int val, int  min) {
            this.val = val;
            this.min = min;
        }
    }

    Stack<Node> s = new Stack<>();

    public MinStack() {

    }

    public void push(int x) {
       Node node = null;
       if(s.isEmpty()) {
           node = new Node(x, x);
       } else {
           node = new Node(x, x < s.peek().val ? x : s.peek().min);
       }
       s.push(node);
    }

    public void pop() {
        s.pop();
    }

    public int top() {
        return s.peek().val;
    }

    public int getMin() {
        return s.peek().min;
    }
}
