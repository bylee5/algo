package 승지니어.day18;

import junit.framework.TestCase;

import java.util.Arrays;

public class NextPermutationTest extends TestCase {
    public void testNextPermutation() {
        int[] nums = {1,3,5,4,4};
        NextPermutation np = new NextPermutation();
        np.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
