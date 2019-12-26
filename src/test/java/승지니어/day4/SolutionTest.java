package 승지니어.day4;

import junit.framework.TestCase;

import java.util.Arrays;

public class SolutionTest extends TestCase {
    public void testSolution() {
        int[] nums = {2, 7, 11, 16};
        int target  = 9;

        Solution s = new Solution();
        System.out.println("대안1: " + Arrays.toString(s.twoSum1(nums, target)));
        System.out.println("대안2: " + Arrays.toString(s.twoSum2(nums, target)));
    }
}
