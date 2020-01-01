package 승지니어.day9;

import junit.framework.TestCase;

public class SymmetricTreeTest extends TestCase {
    public void testSymmetricTree() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(2);
        TreeNode tn4 = new TreeNode(3);
        TreeNode tn5 = new TreeNode(4);
        TreeNode tn6 = new TreeNode(4);
        TreeNode tn7 = new TreeNode(3);

        tn1.left = tn2;
        tn1.right = tn3;

        tn2.left = tn4;
        tn2.right = tn5;

        tn3.left = tn6;
        tn3.right = tn7;

        tn4.left = null;
        tn4.right = null;

        tn5.left = null;
        tn5.right = null;

        tn6.left = null;
        tn6.right = null;

        tn7.left = null;
        tn7.right = null;

        SymmetricTree st = new SymmetricTree();
        System.out.println(st.isSymmetric(tn1));
    }
}
