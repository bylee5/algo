package 승지니어.day41;

import junit.framework.TestCase;
import 승지니어.day19.BinaryTreeZigzagLevelOrderTraversal;

public class BinaryTreeLevelOrderTraversalTest extends TestCase {
    public void testBinaryTreeLevelOrderTraversal() {
        TreeNode t3 = new TreeNode(3);
        TreeNode t9 = new TreeNode(9);
        TreeNode t20 = new TreeNode(20);
        TreeNode t15 = new TreeNode(15);
        TreeNode t7 = new TreeNode(7);

        t3.left = t9;
        t3.right = t20;
        t9.left = null;
        t9.right = null;
        t20.left = t15;
        t20.right = t7;
        t15.left = null;
        t15.right = null;
        t7.left = null;
        t7.right = null;

        BinaryTreeLevelOrderTraversal b = new BinaryTreeLevelOrderTraversal();
        System.out.println(b.levelOrder(t3));
    }

}