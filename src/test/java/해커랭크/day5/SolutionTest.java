package 해커랭크.day5;

import junit.framework.TestCase;
import org.junit.Test;
import 해커랭크.day5.Solution;

public class SolutionTest extends TestCase {
    @Test
    public void testSolution() {
        int n = 8;
        String s = "UDDDUDUU";

        int res = Solution.countingValleys(n, s);
        assertEquals(res, 1);

        int n1 = 12;
        String s1 = "DDUUDDUDUUUD";

        int res1 = Solution.countingValleys(n1, s1);
        assertEquals(res1, 2);
    }
}
