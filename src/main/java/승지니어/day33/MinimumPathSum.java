package 승지니어.day33;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int[][] d = new int[grid.length][grid[0].length];
        d[0][0] = grid[0][0];

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(i == 0 && j == 0) continue;

                int up = (i > 0) ? d[i-1][j] : Integer.MAX_VALUE;
                int left = (j > 0) ? d[i][j-1] : Integer.MAX_VALUE;

                d[i][j] = Math.min(left, up) + grid[i][j];
            }
        }
        return d[grid.length-1][grid[0].length-1];
    }
}
