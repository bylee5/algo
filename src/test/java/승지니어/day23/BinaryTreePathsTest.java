package 승지니어.day23;

import junit.framework.TestCase;

public class BinaryTreePathsTest extends TestCase {
    public void testBinaryTreePaths() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(3);
        TreeNode tn5 = new TreeNode(5);
        TreeNode tn7 = new TreeNode(7);

        tn1.left = tn2;
        tn1.right = tn3;

        tn2.left = null;
        tn2.right = tn5;

        tn3.left = null;
        tn3.right = tn7;

        tn5.left = null;
        tn5.right = null;

        tn7.left = null;
        tn7.right = null;

        BinaryTreePaths btp = new BinaryTreePaths();
        System.out.println(btp.binaryTreePaths(tn1));
    }
}
