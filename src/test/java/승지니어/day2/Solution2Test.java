package 승지니어.day2;


import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import 승지니어.day2.Solution2;//비활성지만 Node 때문에 필요함

public class Solution2Test extends TestCase {
    @Test
    public void testSolution2() throws Exception {
        Node n5 = new Node(5, new ArrayList());//new ArrayList() 대신 null 사용시 for each 문에서 오류 발생 주의
        Node n6 = new Node(6, new ArrayList());
        List<Node> c2 = new ArrayList<>();
        c2.add(n5);
        c2.add(n6);

        Node n3 = new Node(3, c2);
        Node n2 = new Node(2, new ArrayList());
        Node n4 = new Node(4, new ArrayList());

        List<Node> c1 = new ArrayList<>();
        c1.add(n3);
        c1.add(n2);
        c1.add(n4);

        Node n1 = new Node(1, c1);

        Solution2 s = new Solution2();
        System.out.println(s.maxDepth(n1));//3
    }
}