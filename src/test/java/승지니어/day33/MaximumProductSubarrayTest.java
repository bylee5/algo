package 승지니어.day33;

import junit.framework.TestCase;

public class MaximumProductSubarrayTest extends TestCase {
    public void testMaximumProductSubarray() {
        int[] nums = {2,3,-2,4};

        MaximumProductSubarray m = new MaximumProductSubarray();
        System.out.println(m.maxProduct(nums));
    }
}
