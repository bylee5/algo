package 승지니어.day36;

import junit.framework.TestCase;

public class NumberOfIslandsTest extends TestCase {
    public void testNumberOfIslands() {
        char[][] grid = {{'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};

        NumberOfIslands n = new NumberOfIslands();
        System.out.println(n.numIslands(grid));//1
    }
}
