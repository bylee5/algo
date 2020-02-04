package 승지니어.day41;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;


public class TheSkylineProblemTest extends TestCase {
    public void testTheSkylineProblem() {
        int[][] buildings = {{2, 9, 10},{3, 7, 15},{5, 12, 12}, {15, 20, 10}, {19, 24, 8}};

        TheSkylineProblem t = new TheSkylineProblem();
        List<int[]> ret = t.getSkyline(buildings);
        for(int[] i : ret) {
            System.out.println(Arrays.toString(i));
        }
    }
}