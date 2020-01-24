package 승지니어.day30;

public class UniquePaths2 {
    public int uniquePathWithObstacles(int[][] obstacleGrid) {
        /*
        d[i][j] = 0,0 -> i,j 경로의 갯수
        return d[x][y]
         */
        int[][] o = obstacleGrid;
        int[][] d = new int[o.length][o[0].length];
        d[0][0] = 1;//자기 자신으로 오는 경로는 1

        for(int i = 0; i < o.length; i++) {
            for(int j = 0; j < o[0].length; j++) {
                int cur = o[i][j];
                if(cur == 1) {
                    d[i][j] = 0;
                } else {
                    if(i > 0) d[i][j] += d[i-1][j];
                    if(j > 0) d[i][j] += d[i][j-1];
                }
            }
        }
        return d[o.length-1][o[0].length-1];
    }
}
