package day2;

import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {
    @Test
    public void testSolution() throws Exception {
        String[] s = {"-1 -1 0 -9 -2 -2",
                "-2 -1 -6 -8 -2 -5",
                "-1 -1 -1 -2 -3 -4",
                "-1 -9 -2 -4 -4 -5",
                "-7 -3 -3 -2 -9 -9",
                "-1 -3 -1 -2 -4 -5"};

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = s[i].split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int res = Solution.hourglassSum(arr);
        assertEquals(res, -6);
    }
}
