package day4;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    static int sockMerchant2(int n, int[] ar) {
        int res = 0;
        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < n; i++){
            if(!set.contains(ar[i])) {
                set.add(ar[i]);
            } else {
                res++;
                set.remove(ar[i]);
            }
        }

        return res;
    }
}
