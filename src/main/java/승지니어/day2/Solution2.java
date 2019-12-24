package 승지니어.day2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
public class Solution2 {
    public int maxDepth(Node root) {
        Queue<Node> q = new LinkedList<>();//offer: 넣기, poll: 뽑기, peek: 꺼내기 않고 값만 확인
        q.offer(root);
        int depth = 0;

        while(!q.isEmpty()) {
            depth++;
            int size = q.size();
            for(int i = 0; i < size; i++) {
                Node node = q.poll();
                for(Node child:node.children) {//null 주의
                    q.offer(child);
                }
            }
        }
        return depth;
    }
}
