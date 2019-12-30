package 승지니어.day7;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
/*
preorder: 자신 선택 -> 자식 보고
postorder: 자식 보고 -> 자신 선택
 */
public class Solution1 {
    public List<Integer> preorder(Node root) {
        List<Integer> ret = new ArrayList<>();
        traverse(root, ret);
        return ret;
    }
    public void traverse(Node root, List<Integer> ret) {
        if(root == null) return;

        ret.add(root.val);
        for(Node child: root.children) {
            traverse(child, ret);
        }
    }
}
