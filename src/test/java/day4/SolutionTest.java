package day4;

import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {
    @Test
    public void testSolution() throws Exception {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int res = Solution.sockMerchant(n, ar);
        assertEquals(res, 3);

        int n2 = 15;
        int[] ar2 = {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};

        int res2 = Solution.sockMerchant(n2, ar2);
        assertEquals(res2, 6);


        int n3 = 15;
        int[] ar3 = {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};
        int res3 = Solution2.sockMerchant2(n3, ar3);
        assertEquals(res3, 6);
    }
}
