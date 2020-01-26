package 승지니어.day31;

import junit.framework.TestCase;

public class MaximumSubarrayTest extends TestCase {
    public void testMaximumSubarray() {
        int[] nums = {-2, 1,-3,4,-1,2,1,-5,4};

        MaximumSubarray m = new MaximumSubarray();
        System.out.println(m.maxSubarray(nums));
    }
}
