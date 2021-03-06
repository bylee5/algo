package 승지니어.day11;

import junit.framework.TestCase;

public class BinarySearchTreeIteratorTest extends TestCase {
    public void testBinarySearchTreeIterator() {
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

        BinarySearchTreeIterator bsti = new BinarySearchTreeIterator(tn1);
        while(bsti.hasNext()) {
            System.out.println(bsti.next());
        }
    }
}
