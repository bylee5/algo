package 승지니어.day24;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    //ex input: 1,2,3
    //call 0: add 1 //1
    //call 1: skip 1, add 2 // 1,2
    //call 2: skip 1, skip 2, add 3 // 1,2,3
    //call 3: base case 1,2,3->add to ret
    //call 2: remove 3, return // 1,2
    //call 1: remove 2, add 3 // 1,3
    //call 4: skip 1, add 2 // 1,3,2
    //call 5: base case, 1,2,3->add to ret
    //call 4: remove 2, skip 3 return //1,3 -> // 2,1,3...
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        backtrack(nums, ret, tmp);
        return ret;
    }

    public void backtrack(int[] nums, List<List<Integer>> ret, List<Integer> tmp) {
        //base case
        if(tmp.size() == nums.length) {
            ret.add(new ArrayList<Integer>(tmp));
            return;
        }
        //recursion
        for(int num : nums) {
            if(tmp.contains(num)) continue;
            tmp.add(num);
            backtrack(nums, ret, tmp);
            tmp.remove(tmp.size() -1);
        }
    }
}
