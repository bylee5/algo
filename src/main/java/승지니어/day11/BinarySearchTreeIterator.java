package 승지니어.day11;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
/*
바이너리 서치트리를 인오더 순회를 하면
그게 결국 오름차순 정렬된 값을 반환하게 된다.
left self right
바이너리 서치트리: 왼쪽 섭트리는 나보다 다 작고, 오른쪽 섭트리는 나보다 다 크다.
 */
public class BinarySearchTreeIterator {
    Stack<TreeNode> stack = new Stack<>();

    public BinarySearchTreeIterator(TreeNode root) {
        while(root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        TreeNode node = stack.pop();
        if(node.right != null) {
            TreeNode cur = node.right;
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
        }
        return node.val;
    }
}
