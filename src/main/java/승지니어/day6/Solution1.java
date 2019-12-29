package 승지니어.day6;
//XOR
// 1. a a b b c d 배열을 전부다 XOR = c^d
// 2. c^d 적어도 한 비트는 1
// 3. 그 1비트자리에서 c:0 d:1 혹은 그 반대
// 4. 그 1비트자리를 기준으로 모든 원소를 두 그룹으로 나눌 수 있음
// 5. 각 그룹마다  유일하게 등장하는 원소는 하나
public class Solution1 {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num:nums) xor ^= num;

        int idx = 0;
        for(int i = 0; i < 32; i++) {
            if(((xor >> i) & 1) == 1) {
                idx = i;
                break;
            }
        }

        int xor1 = 0;
        int xor2 = 0;

        for(int num:nums) {
            if(((num >> idx) & 1) == 1) {
                xor1 ^= num;
                System.out.println("xor1: " + Integer.toBinaryString(xor1));
            } else {
                xor2 ^= num;
                System.out.println("xor2: " + Integer.toBinaryString(xor2));
            }
        }

        int[] ret = new int[2];
        ret[0] = xor1;
        ret[1] = xor2;

        return ret;
    }
}
