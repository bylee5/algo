package 승지니어.day14;

import junit.framework.TestCase;

public class InsertIntoBinarySearchTreeTest extends TestCase {
    public void testInsertIntoBinarySearchTree(){
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(3);
        TreeNode tn4 = new TreeNode(4);
        TreeNode tn7 = new TreeNode(7);

        tn1.left = null;
        tn1.right = null;

        tn3.left = null;
        tn3.right = null;

        tn2.left = tn1;
        tn2.right = tn3;

        tn4.left = tn2;
        tn4.right = tn7;

        InsertIntoBinarySearchTree iibst = new InsertIntoBinarySearchTree();
        iibst.insertIntoBST(tn4, 5);
        System.out.println(tn4.right.left.val);
    }
}
