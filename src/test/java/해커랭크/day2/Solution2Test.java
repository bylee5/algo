package 해커랭크.day2;

import junit.framework.TestCase;
import org.junit.Test;
import 해커랭크.day2.Solution2;

public class Solution2Test extends TestCase {
    @Test
    public void testSolution() throws Exception {
        String a = "cde";
        String b = "abc";

        int res = Solution2.makeAnagram(a, b);

        assertEquals(4, res);
    }
}
