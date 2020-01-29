package 승지니어.day35;

import junit.framework.TestCase;

public class HammingDistanceTest extends TestCase {
    public void testHammingDistance() {
        int x = 1;
        int y = 4;

        HammingDistance h = new HammingDistance();
        System.out.println(h.hammingDistance(x, y));//2
    }
}
