package 승지니어.day14;

import java.util.Stack;

/*
스택: LIFO + LIFO -> FIFO
큐: FIFO

5   1
4   2
3 ->3
2   4
1   5
 */
public class ImplementQueueUsingStacks {
    // 인으로 들어가서 아웃으로 나온다
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public ImplementQueueUsingStacks() {}

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        peek();
        return out.pop();
    }

    public int peek() {
        if(out.isEmpty()) {
            while(!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
