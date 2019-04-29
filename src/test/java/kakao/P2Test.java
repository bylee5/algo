package kakao;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class P2Test extends TestCase {
    @Test
    public void testP2() throws Exception {
        List<Integer> issuePriorities = new ArrayList<Integer>();
        issuePriorities.add(18);
        issuePriorities.add(60);
        issuePriorities.add(92);
        issuePriorities.add(35);

        issuePriorities.add(5);
        issuePriorities.add(97);
        issuePriorities.add(65);

        List<Integer> result = P2.reassignedPriorities(issuePriorities);

        System.out.println(result.toString());
    }
}