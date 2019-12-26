package 승지니어.day4;

import java.util.HashMap;
import java.util.Map;

/*
왜 이 문제가 hashmap을 사용해야 하는가?

문제가 주어지면 내가 어떻게 문제를 풀지 담당자에게 확인을 받고, 코딩을 한다.

시간복잡도 <-> 공간복잡도
대안 1. brute-force 모든 조합을 시도. 2장 루프 n*(n-1) / 2
    - 시간: O(n^2)
    - 공간: O(1)
대안 2. 해쉬맵 사용, 루프 1개 돌면서 이미 봤던 값을 해쉬맵에 넣음
    - 시간: O(n)
    - 공간: o(n)
 */
public class Solution {
    //대안1
    int[] twoSum1(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    int[] ret = new int[2];
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return null;
    }
    // 대안2
    int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();//nums: [2,7,11,15]일 때, 키는 값(예 2), 밸류는 인덱스(예 0)

        for(int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if(map.containsKey(target-cur)) {
                int[] ret = new int[2];
                ret[0] = map.get(target-cur);
                ret[1] = i;
                return ret;
            } else {
                map.put(cur, i);
            }
        }
        return null;
    }
}
