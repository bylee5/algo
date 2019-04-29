package day3;

import junit.framework.TestCase;
import org.junit.Test;

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
