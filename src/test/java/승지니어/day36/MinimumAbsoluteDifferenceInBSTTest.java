package 승지니어.day36;

import junit.framework.TestCase;

public class MinimumAbsoluteDifferenceInBSTTest extends TestCase {
    public void testMinimumAbsoluteDifferenceInBST() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t3 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2);

        t1.left = null;
        t1.right = t3;
        t3.left = t2;
        t3.right = null;
        t2.left = null;
        t2.right = null;

        MinimumAbsoluteDifferenceInBST m = new MinimumAbsoluteDifferenceInBST();
        System.out.println(m.getMinimumDifference(t1));//1
    }
}
