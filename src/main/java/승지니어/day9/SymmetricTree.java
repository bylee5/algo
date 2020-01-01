package 승지니어.day9;

class  TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return compare(root.left, root.right);
    }
    public boolean compare(TreeNode a, TreeNode b) {
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        if(a.val != b.val) return false;
        return compare(a.left, b.right) && compare(a.right, b.left);
    }
}
