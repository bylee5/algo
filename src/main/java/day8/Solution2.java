package day8;

public class Solution2 {
    static void minimumBribes(int[] q) {
        int n = q.length;
        int cnt = 0;
        for(int i = n - 1; i >= 0; i--) {
            if(q[i] != (i + 1)) {
                if(((i - 1) >= 0) && q[i - 1] == (i + 1)) {
                    cnt++;
                    swap(q, i, i - 1);
                } else if(((i - 2) >= 0) && q[i - 2] == (i + 1)) {
                    cnt += 2;
                    q[i - 2] = q[i - 1];
                    q[i - 1] = q[i];
                    q[i] = i + 1;
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(cnt);
        return;
    }

    static void swap(int[] temp, int a, int b) {
        int tmp = temp[a];
        temp[a] = temp[b];
        temp[b] = tmp;
    }

    public static void main(String arg[]) {
        int[] q = {2, 1, 5, 3, 4};
        minimumBribes(q);
        int[] q1 = {2, 5, 1, 3, 4};
        minimumBribes(q1);
        int[] q3 = {1,2,5,3,4,7,8,6};
        minimumBribes(q3);
    }
}
