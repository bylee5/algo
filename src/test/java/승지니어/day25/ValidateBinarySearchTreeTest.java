package 승지니어.day25;

import junit.framework.TestCase;

public class ValidateBinarySearchTreeTest extends TestCase {
    public void testValidateBinarySearchTreeTest1() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(3);

        tn2.left = tn1;
        tn2.right = tn3;
        tn1.left = null;
        tn1.right = null;
        tn3.left = null;
        tn3.right = null;

        ValidateBinarySearchTree vbst = new ValidateBinarySearchTree();
        System.out.println(vbst.inValidBST(tn2));
    }

    public void testValidateBinarySearchTreeTest2() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn4 = new TreeNode(4);
        TreeNode tn5 = new TreeNode(5);

        tn5.left = tn1;
        tn5.right = tn4;
        tn1.left = null;
        tn1.right = null;
        tn4.left = null;
        tn4.right = null;

        ValidateBinarySearchTree vbst = new ValidateBinarySearchTree();
        System.out.println(vbst.inValidBST(tn5));
    }
}
