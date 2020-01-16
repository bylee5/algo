package 승지니어.day21;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int x = 0;
        int cnt = 0;
        for(int num: nums) {
            if(cnt == 0) {
                x = num;
                cnt++;
            } else if(x == num) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return x;
    }
}
