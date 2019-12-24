package 승지니어.day2;

import junit.framework.TestCase;
import org.junit.Test;
import 승지니어.day2.Solution1;

public class Solution1Test extends TestCase {
    @Test
    public void testSolution1() throws Exception {
        TreeNode tn1 = new TreeNode(3);
        TreeNode tn2 = new TreeNode(9);
        TreeNode tn3 = new TreeNode(20);
        TreeNode tn4 = new TreeNode(15);
        TreeNode tn5 = new TreeNode(7);

        tn1.left = tn2;
        tn1.right = tn3;

        tn2.left = null;
        tn2.right = null;

        tn3.left = tn4;
        tn3.right = tn5;

        tn4.left = null;
        tn4.right = null;

        tn5.left = null;
        tn5.right = null;

        Solution1 s = new Solution1();
        System.out.println(s.levelOrderBottom(tn1));
    }
}