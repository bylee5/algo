package 승지니어.day1;

import junit.framework.TestCase;
import org.junit.Test;
import 승지니어.day1.Solution;

public class SolutionTest extends TestCase {
    @Test
    public void testSolution() throws Exception {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn3 = new TreeNode(2);
        TreeNode tn4 = new TreeNode(3);

        tn1.left = null;
        tn1.right = tn3;

        tn3.left = tn4;
        tn3.right = null;

        tn4.left = null;
        tn4.right = null;

        Solution s = new Solution();
        System.out.println(s.inorderTraversal(tn1));
    }
}

