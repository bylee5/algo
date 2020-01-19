package 승지니어.day25;

import junit.framework.TestCase;

public class KthLargestElementInAnArrayTest extends TestCase {
    public void testKthLargestElementInAnArrayTest() {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        KthLargestElementInAnArray kle = new KthLargestElementInAnArray();
        System.out.println(kle.findKthLargest(nums, k));
    }
}
