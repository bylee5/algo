package 승지니어.day24;

import junit.framework.TestCase;

public class PermutationsTest extends TestCase {
    public void testPermutations() {
        int[] nums = {1,2,3};

        Permutations p = new Permutations();
        System.out.println(p.permute(nums));
    }
}
