package 승지니어.day20;

import junit.framework.TestCase;

public class FindLargestValueInEachTreeRowTest extends TestCase {
    public void testFindLargestValueInEachTreeRow() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn3_1 = new TreeNode(3);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn5 = new TreeNode(5);
        TreeNode tn3_2 = new TreeNode(3);
        TreeNode tn9 = new TreeNode(9);

        tn1.left = tn3_1;
        tn1.right = tn2;
        tn3_1.left = tn5;
        tn3_1.right = tn3_2;
        tn2.left = null;
        tn2.right = tn9;
        tn5.left = null;
        tn5.right = null;
        tn3_2.left = null;
        tn3_2.right = null;
        tn9.left = null;
        tn9.right = null;

        FindLargestValueInEachTreeRow flv = new FindLargestValueInEachTreeRow();
        System.out.println(flv.largestValues(tn1));

    }
}
