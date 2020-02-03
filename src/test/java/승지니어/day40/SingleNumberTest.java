package 승지니어.day40;

import junit.framework.TestCase;

public class SingleNumberTest extends TestCase {
    public void testSingleNumber() {
        int[] nums = {2,2,1};

        SingleNumber s = new SingleNumber();
        System.out.println(s.singleNumber(nums));//1
    }
}