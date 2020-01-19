package 승지니어.day25;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; };
}
public class ValidateBinarySearchTree {
    public boolean inValidBST(TreeNode root) {
        return isValidBST(root, false, false, 0, 0);
    }

    public boolean isValidBST(TreeNode root, boolean lowerBoundExist, boolean upperBoundExist,
                              int lowerBound, int upperBound) {
        //base case
        if(root == null) return true;
        //base case
        // 현재 노드가 lower/upperbound를 침범하지 않는가
        if(lowerBoundExist && root.val <= lowerBound) {
            return false;
        }
        if(upperBoundExist && root.val >= upperBound) {
            return false;
        }
        //그렇지 않다면 재귀적으로 또 확인
        return isValidBST(root.left, lowerBoundExist, true, lowerBound, root.val)
                && isValidBST(root.right, true, upperBoundExist, root.val, upperBound);
    }
}
