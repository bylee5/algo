package 해커랭크.day3;

import junit.framework.TestCase;
import org.junit.Test;
import 해커랭크.day3.Solution;

public class SolutionTest extends TestCase {
    @Test
    public void testSolution() throws Exception {
        String s = "aabbcd";

        String res = Solution.isValid(s);
        assertEquals("No", res);

        s = "abcdee";

        res = Solution.isValid(s);
        assertEquals("Yes", res);
    }
}
