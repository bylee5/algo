package 해커랭크.day2;

public class Solution1 {
    static int[] rotLeft(int[] arr, int d) {
        for(int j = 0; j < d; j++) {
            int tmp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length - 1] = tmp;
        }
        return arr;
    }
}
