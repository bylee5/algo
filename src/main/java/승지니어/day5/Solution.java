package 승지니어.day5;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
/*
inorder: left self right -> 이진검색트리에서는 정렬이 된다.
preorder: self left right
postorder: left right self
 */
public class Solution {
    int k;
    int i;
    int ret;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        i = 0;
        traverse(root);
        return ret;
    }
    // 시간을 줄일 수 있나? traverse1()
    public void traverse(TreeNode root) {
        if(root == null) return;

        traverse(root.left);
        //self
        if(++i == k) {
            ret = root.val;
        }
        traverse(root.right);
    }
    public boolean traverse1(TreeNode root) {
        if(root == null) return false;
        boolean b = traverse1(root.left);
        if(b) return true;
        if(++i == k) {
            ret = root.val;
            return true;
        }
        return traverse1(root.right);
    }
}