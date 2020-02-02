package 승지니어.day38;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class RangeSumOfBST {
    //1. root == null return 0;
    //2. root.val < L -> only recurse to right
    //3. root.val > R -> only recurse to left
    //4. L <= root.val <= R -> recurse left+ root.val + recurse right
    //2 5 8 -> 5
    //3 5 7 -> 15
    //root.val = 5 + recurse left + recurse right
    //
    //1 2 [3 4 5 6 7] 8 9 10
    public int rangeSumBST(TreeNode root, int L, int R) {
       if(root == null) return 0;
       else if(root.val < L) {
           return rangeSumBST(root.right, L, R);
       } else if (root.val > R) {
           return rangeSumBST(root.left, L, R);
       } else {
           return rangeSumBST(root.left, L, R) + root.val
                   + rangeSumBST(root.right, L, R);
       }
    }
}
