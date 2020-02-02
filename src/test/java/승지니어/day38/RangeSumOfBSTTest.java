package 승지니어.day38;

import junit.framework.TestCase;

public class RangeSumOfBSTTest extends TestCase {
    public void testRangeSumOfBST() {
        TreeNode t10 = new TreeNode(10);
        TreeNode t5 = new TreeNode(5);
        TreeNode t15 = new TreeNode(15);
        TreeNode t3 = new TreeNode(3);
        TreeNode t7 = new TreeNode(7);
        TreeNode t18 = new TreeNode(18);

        t10.left = t5;
        t10.right = t15;
        t5.left = t3;
        t5.right = t7;
        t15.left = null;
        t15.right = t18;

        t3.left = null;
        t3.right = null;
        t7.left = null;
        t7.right = null;
        t18.left = null;
        t18.right = null;

        RangeSumOfBST r = new RangeSumOfBST();
        System.out.println(r.rangeSumBST(t10, 7, 15));//32
    }
}
