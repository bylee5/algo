package 해커랭크.day9;

public class ArrayManipulation {
    public long arrayManipulation(int n, int[][] queries) {
        long[] value = new long[n+2];

        for(int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            long k = queries[i][2];

            value[a] += k;
            value[b+1] -= k;
        }

        long mx = 0;
        long sum = 0;
        for(int i = 1; i < n+1; i++) {
            sum += value[i];
            mx = Math.max(mx, sum);
        }
        return mx;
    }
}
