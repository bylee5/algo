package day7;

import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {
    @Test
    public void testSolution() {
        String s= "aba";
        long n = 10;
        long res = Solution.repeatedString(s, n);
        assertEquals(res, 7);

        String s1 = "a";
        long n1 = 1000000000000L;
        long res1 = Solution.repeatedString(s1, n1);
        assertEquals(res1, 1000000000000L);

    }
}