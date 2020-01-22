package 승지니어.day28;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] d = new int[m][n];
        d[0][0] = 1;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i > 0) d[i][j] += d[i-1][j];
                if(j > 0) d[i][j] += d[i][j-1];
            }
        }
        return d[m-1][n-1];
    }
}
