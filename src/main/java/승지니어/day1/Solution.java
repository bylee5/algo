package 승지니어.day1;

//Definition for a binary tree node.

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

/*

inorder : left self right
preorder : self left right
postorder : left right self

 */
public class Solution {
    List<Integer> ret;
    public List<Integer> inorderTraversal(TreeNode root) {
        ret = new ArrayList<Integer>();
        traverse(root);
        return ret;
    }

    public void traverse(TreeNode self) {
        if(self == null) return;
        traverse(self.left);
        ret.add(self.val);
        traverse(self.right);
    }
}
