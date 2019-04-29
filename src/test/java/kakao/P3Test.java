package kakao;

import junit.framework.TestCase;
import org.junit.Test;

public class P3Test extends TestCase {
    @Test
    public void testP3() throws Exception {
        int num = 123512;
        long l = P3.findRange(num);
        System.out.println(l);

        int num1 = 909;
        long l1 = P3.findRange(num1);
        System.out.println(l1);
    }
}