package 승지니어.day16;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    Queue<Integer> q = new LinkedList<>();

    public ImplementStackUsingQueues() {

    }

    // 원소 넣기
    public void push(int x) {
        int size = q.size();
        q.offer(x);
        for(int i = 0; i < size; i++) {
            q.offer(q.poll());
        }
    }

    //최상위 원소 꺼내기
    public int pop() {
        return q.poll();
    }

    //최상위 원소 보기
    public int top() {
        return q.peek();//큐에서 꺼내지 않고 보여주기만 한다.
    }

    //스택이 비어 있는지 확인
    public boolean empty() {
        return q.isEmpty();
    }
}
