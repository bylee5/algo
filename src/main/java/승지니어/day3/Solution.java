package 승지니어.day3;

//XOR
//n ^ n = 0
public class Solution {
    public int singleNumber(int[] nums) {
        int ret = 0;
        for(int num: nums) ret ^= num;
        return ret;
    }
}
