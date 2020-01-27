package 승지니어.day33;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        //d[i][0] -> +, 0~i까지 최대 곱
        //d[i][1] -> -, 0~i까지 최대 곱
        int[][] d = new int[nums.length][2];
        d[0][0] = nums[0];
        d[0][1] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int c = nums[i];
            d[i][0] = Math.max(c, Math.max(c * d[i-1][0], c * d[i-1][1]));
            d[i][1] = Math.max(c, Math.max(c * d[i-1][0], c * d[i-1][1]));
        }

        int max = d[0][0];
        for(int i = 0; i < nums.length; i++) {
            if(d[i][0] > max) max = d[i][0];
        }
        return max;
    }
}
