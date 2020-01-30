package 승지니어.day36;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class MinimumAbsoluteDifferenceInBST {
    //트리 순회(재귀적)
    //preorder: self left right
    //inorder: left self right
    //postorder: left right self
    //이진검색트리 성질을 이용해 -> inorder -> 수행하면 오름차순 정렬이 된다.
    boolean init; //첫 노드인지 확인하는 플래그
    int min; // 매 단계의 최소값을 가지고 다니면서 비교한다.
    int prev; // 이전 노드의 값을 가지고 다닌다.
    public int getMinimumDifference(TreeNode root) {
       init = false;
       min = Integer.MAX_VALUE;
       inorder(root);
       return min;
    }
    public void inorder(TreeNode root) {
        if(root == null) return;
        //left
        inorder(root.left);
        //self
        if(!init) {
            init = true;
        } else {
            min = Math.min(min, root.val-prev);
        }
        prev = root.val;
        //right
        inorder(root.right);
    }

}
