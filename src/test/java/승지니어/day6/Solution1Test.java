package 승지니어.day6;

import junit.framework.TestCase;

import java.util.Arrays;

public class Solution1Test extends TestCase {
    public void testSolution1() {
        int[] nums = {1, 2, 1, 3, 2, 5};
        Solution1 s = new Solution1();

        System.out.println(Arrays.toString(s.singleNumber(nums)));//3, 5
    }
}
