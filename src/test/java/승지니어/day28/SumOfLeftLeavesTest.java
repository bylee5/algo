package 승지니어.day28;

import junit.framework.TestCase;

public class SumOfLeftLeavesTest extends TestCase {
    public void testSumOfLeftLeaves() {
        TreeNode tn3 = new TreeNode(3);
        TreeNode tn9 = new TreeNode(9);
        TreeNode tn20 = new TreeNode(20);
        TreeNode tn15 = new TreeNode(15);
        TreeNode tn7 = new TreeNode(7);

        tn3.left = tn9;
        tn3.right = tn20;
        tn9.left = null;
        tn9.right = null;
        tn20.left = tn15;
        tn20.right = tn7;
        tn15.left = null;
        tn15.right = null;
        tn7.left = null;
        tn7.right = null;

        SumOfLeftLeaves s = new SumOfLeftLeaves();
        System.out.println(s.sumOfLeftLeaves(tn3));
    }
}
