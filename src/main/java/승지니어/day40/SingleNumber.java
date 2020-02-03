package 승지니어.day40;

public class SingleNumber {
    //hash map approach of key: value, value: count
    // 4 -1
    // 1 -2
    // 2 -2
    //O(n) time, O(n) space -can do better with bitwise xor approach
    //xor : given bits, return - when they are the same, otherwise  return 1
    // 0 0 -> 0
    // 0 1 -> 1
    // 1 0 -> 1
    // 1 1 -> 0
    // a xor b == b xor a
    // (a xor b) xor c == a xor (b xor c)
    // a xor a = 0
    // 4,1,2,1,2
    //O(n) time O(1) space
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int num: nums) {
           xor ^= num;
        }
        return xor;
    }
}
