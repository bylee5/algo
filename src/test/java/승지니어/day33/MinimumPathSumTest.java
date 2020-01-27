package 승지니어.day33;

import junit.framework.TestCase;

public class MinimumPathSumTest extends TestCase {
    public void testMinimumPathSum() {
        int[][] grid = {
                    {1,3,1},
                    {1,5,1},
                    {4,2,1}
                };
        MinimumPathSum m = new MinimumPathSum();
        System.out.println(m.minPathSum(grid));
    }
}
