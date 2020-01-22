package 승지니어.day28;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class SumOfLeftLeaves {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
       if(root != null) traverse(root);
       return sum;
    }

    public boolean traverse(TreeNode root) {
        if(root.left != null) {
            boolean isLeaf = traverse(root.left);
            if(isLeaf) sum += root.left.val;
        }
        if(root.right != null) traverse(root.right);
        //self
        return root.left == null & root.right == null;
    }
}
