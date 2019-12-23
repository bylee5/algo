package 해커랭크.day4;

public class Solution {
    static int sockMerchant(int n, int[] ar) {
        int res = 0;

        // 1. n만큼 반복
        // 2. ar[i]가 -1이면 break
        // 3. ar[j]가 -1이면 continue
        // 4. 같으면 res++하고 ar[i] = -1, ar[j] = -1, break

        //1.
        for(int i = 0; i < n; i++){
            //2.
            if(ar[i] == -1){
                continue;
            }
            for(int j = i+1; j < n; j++) {
                //3.
                if(ar[j] == -1) {
                    continue;
                }
                // 4.
                if (ar[i] == ar[j]) {
                    res++;
                    ar[i] = -1;
                    ar[j] = -1;

                    break;
                }
            }
        }

        return res;
    }
}
