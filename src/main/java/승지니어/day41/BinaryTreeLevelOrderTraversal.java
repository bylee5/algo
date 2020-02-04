package 승지니어.day41;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> ret = new ArrayList<>();
       if(root == null) return ret;
       //offer, poll
       Queue<TreeNode> q = new LinkedList<>();
       q.offer(root);

       while(!q.isEmpty()) {
           int size = q.size();
           List<Integer> list = new ArrayList<>();
           for(int i = 0; i < size; i++) {
               TreeNode cur = q.poll();
               list.add(cur.val);
               if(cur.left != null) q.offer(cur.left);
               if(cur.right != null) q.offer(cur.right);
           }
           ret.add(list);
       }
       return ret;
    }
}
