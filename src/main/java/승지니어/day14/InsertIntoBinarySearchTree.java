package 승지니어.day14;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
/*
제약 조건이 없어서 어려운 점은 없음
균형 트리 조건이라던지
 */
public class InsertIntoBinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }

        TreeNode child = null;
        if(val > root.val) {
            child = insertIntoBST(root.right, val);
            root.right = child;
        } else {
            child = insertIntoBST(root.left, val);
            root.left = child;
        }

        return root;
    }
}
