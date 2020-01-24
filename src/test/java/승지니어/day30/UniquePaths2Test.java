package 승지니어.day30;

import junit.framework.TestCase;

public class UniquePaths2Test extends TestCase {
    public void testUniquePaths2() {
        int[][] obstacleGrid = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
            };

        UniquePaths2 u = new UniquePaths2();
        System.out.println(u.uniquePathWithObstacles(obstacleGrid));
    }
}
