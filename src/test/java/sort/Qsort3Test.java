package sort;

import junit.framework.TestCase;
import org.junit.Test;

public class Qsort3Test extends TestCase {
    @Test
    public void testQsort3() {
        int[] x = {55, 41, 59, 26, 53, 58, 97, 93};
        int[] res = {26, 41, 53, 55, 58, 59, 93, 97};
        Qsort3 qs = new Qsort3(x);
        qs.qsort3(0, 7);
        int[] q = qs.getQsort();
        for (int i = 0; i < q.length; i++) {
            assertEquals(q[i], res[i]);
        }
    }
}
