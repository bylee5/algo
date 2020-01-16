package 승지니어.day21;

import junit.framework.TestCase;

public class MajorityElementTest extends TestCase {
    public void testMajorityElement() {
        int[] nums = {3, 2, 3};

        MajorityElement me = new MajorityElement();
        System.out.println(me.majorityElement(nums));
    }
    public void testMajorityElement1() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        MajorityElement me = new MajorityElement();
        System.out.println(me.majorityElement(nums));
    }
}
