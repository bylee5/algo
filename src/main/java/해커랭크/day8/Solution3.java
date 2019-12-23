package 해커랭크.day8;

//Minimum Swaps 2
public class Solution3 {
    public static int minimumSwaps(int[] arr) {
        int cnt = 0;
        for(int i = arr.length - 1; i > 0; --i) {
            if(arr[i] == i + 1) continue;
            int tmp = arr[i];
            arr[i] = arr[tmp - 1];
            arr[tmp - 1] = tmp;
            cnt++;
            i = arr.length;
        }
        return cnt;
    }

    public static void main(String arg[]) {
        int[] arr = {4, 3, 1, 2};
        System.out.println(minimumSwaps(arr));
        int[] arr1 = {2, 3, 4, 1, 5};
        System.out.println(minimumSwaps(arr1));
    }
}
