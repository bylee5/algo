package 승지니어.day3;

import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {
    @Test
    public void testSolution1() throws Exception {
        int[] input = {2, 2, 1};

        Solution s = new Solution();
        System.out.println(s.singleNumber(input));//1
    }

    @Test
    public void testSolution2() throws Exception {
        int[] input = {4, 1, 2, 2, 1};

        Solution s = new Solution();
        System.out.println(s.singleNumber(input));//4
    }
}
