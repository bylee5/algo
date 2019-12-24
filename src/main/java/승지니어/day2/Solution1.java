package 승지니어.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution1 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if(root == null) return ret;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size; i++){//q.size()를 사용하지 않는 이유는 q.size()가 변할 수 있기 때문이고 대신 size 변수를 사용
                TreeNode node = q.poll();
                level.add(node.val);
                if(node.left != null) q.offer(node.left);//q.isEmpty()에 영향을 줌
                if(node.right != null) q.offer(node.right);//q.isEmpty()에 영향을 줌
            }
            ret.add(0, level);
        }
        return ret;
    }
}
