package day6;

import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {
    @Test
    public void testSolution() {
        int[] n= {0, 0,0,1,0,0,1,0};
        int res = Solution.jumpingOnClouds(n);
        assertEquals(res, 4);

        int[] n1 = {0,0,0,0,1,0};
        int res1 = Solution.jumpingOnClouds(n1);
        assertEquals(res1,3 );

        int[] n2 = {0,0,0,1,0,0};
        int res2 = Solution.jumpingOnClouds(n2);
        assertEquals(res2, 3);
    }
}