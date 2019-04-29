package kakao;

import junit.framework.TestCase;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

public class P1Test extends TestCase {
    @Test
    public void testP1() throws Exception {
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(4);
        a.add(3);

        b.add(0);
        b.add(2);


        List<Integer> res = P1.getMaxElementIndexes(a, b);

        for(Integer i : res){
            System.out.println(i);
        }
    }
}