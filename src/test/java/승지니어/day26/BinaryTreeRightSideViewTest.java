package 승지니어.day26;

import junit.framework.TestCase;

public class BinaryTreeRightSideViewTest extends TestCase {
    public void testBinaryTreeRightSideView() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(3);
        TreeNode tn5 = new TreeNode(5);
        TreeNode tn4 = new TreeNode(4);

        tn1.left = tn2;
        tn1.right = tn3;
        tn2.left = null;
        tn2.right = tn5;
        tn3.left = null;
        tn3.right = tn4;
        tn5.left = null;
        tn5.right = null;
        tn4.left = null;
        tn4.right = null;

        BinaryTreeRightSideView b = new BinaryTreeRightSideView();
        System.out.println(b.rightSideView(tn1));
    }
}
