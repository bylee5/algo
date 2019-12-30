package 승지니어.day7;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class Solution1Test extends TestCase {
    public void testSolution1() {
        Node n5 = new Node(5, new ArrayList());
        Node n6 = new Node(6, new ArrayList());
        List<Node> list2 = new ArrayList<>();
        list2.add(n5);
        list2.add(n6);
        Node n3 = new Node(3, list2);

        Node n2 = new Node(2, new ArrayList());
        Node n4 = new Node(4, new ArrayList());
        List<Node> list1 = new ArrayList<>();
        list1.add(n3);
        list1.add(n2);
        list1.add(n4);
        Node n1 = new Node(1, list1);

        Solution1 s = new Solution1();
        System.out.println(s.preorder(n1));
    }
}
