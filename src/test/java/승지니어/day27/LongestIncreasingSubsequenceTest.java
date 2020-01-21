package 승지니어.day27;

import junit.framework.TestCase;

public class LongestIncreasingSubsequenceTest extends TestCase {
    public void testLongestIncreasingSubsequenceTest() {
        int[] nums = {10,9,2,5,3,7,101,18};
        LongestIncreasingSubsequence l = new LongestIncreasingSubsequence();
        System.out.println(l.lengthOfLIS(nums));
    }
}
