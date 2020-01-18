package 승지니어.day23;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        //define helper variables
        List<String> ret = new ArrayList<>();
        String path = null;

        //edge case where tree is null
        if(root == null) return ret;

        //call the recursion
        path = Integer.toString(root.val);
        traverse(root, ret, path);

        //return
        return ret;
    }

    public void traverse(TreeNode root, List<String> ret, String path) {
       //handle base case
       if(root == null) return;

       //recursion
        //preorder
        //self
        if(root.left == null && root.right == null) ret.add(path);
        //left
        if(root.left != null) traverse(root.left, ret, path+"->"+Integer.toString(root.left.val));
        //right
        if(root.right != null) traverse(root.right, ret, path+"->"+Integer.toString(root.right.val));
    }
}
