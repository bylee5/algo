package 해커랭크.day1;

import junit.framework.TestCase;
import org.junit.Test;
import 해커랭크.day1.Solution;

public class SolutionTest extends TestCase {
    @Test
    public void testSolution() throws Exception {
        String[] d1 = {"119", "97674223", "1195524421"};
        boolean res = Solution.solution1(d1);
        assertFalse(res);

        String[] d2 = {"123","456","789"};
        res = Solution.solution1(d2);
        assertTrue(res);
    }
}
