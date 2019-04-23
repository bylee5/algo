package day2;

import junit.framework.TestCase;
import org.junit.Test;

public class Solution2Test extends TestCase {
    @Test
    public void testSolution() throws Exception {
        String a = "cde";
        String b = "abc";

        int res = Solution2.makeAnagram(a, b);

        assertEquals(4, res);
    }
}
