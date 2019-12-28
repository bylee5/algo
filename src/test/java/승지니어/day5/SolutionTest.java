package 승지니어.day5;

import junit.framework.TestCase;
/*
input: root = [3,1,4,null,2], k =1
output: 1

input: root = [5,3,6,2,4,null,null,1], k = 3
output: 3
 */
public class SolutionTest extends TestCase {
    public void testSolution1() {
        TreeNode tn1 = new TreeNode(3);
        TreeNode tn2 = new TreeNode(1);
        TreeNode tn3 = new TreeNode(4);
        TreeNode tn4 = new TreeNode(2);

        tn1.left = tn2;
        tn1.right = tn3;

        tn2.left = null;
        tn2.right = tn4;

        tn3.left = null;
        tn3.right = null;

        tn4.left = null;
        tn4.right = null;

        Solution s = new Solution();
        System.out.println(s.kthSmallest(tn1, 1));
    }
    public void testSolution2() {
        TreeNode tn1 = new TreeNode(5);
        TreeNode tn2 = new TreeNode(3);
        TreeNode tn3 = new TreeNode(6);
        TreeNode tn4 = new TreeNode(2);
        TreeNode tn5 = new TreeNode(4);
        TreeNode tn6 = new TreeNode(1);

        tn1.left = tn2;
        tn1.right = tn3;

        tn2.left = tn4;
        tn2.right = tn5;

        tn3.left = null;
        tn3.right = null;

        tn4.left = tn6;
        tn4.right = null;

        tn5.left = null;
        tn5.right = null;

        tn6.left = null;
        tn6.right = null;

        Solution s = new Solution();
        System.out.println(s.kthSmallest(tn1, 3));
    }
}