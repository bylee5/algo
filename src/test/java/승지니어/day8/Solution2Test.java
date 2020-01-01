package 승지니어.day8;

import junit.framework.TestCase;

import java.util.Arrays;

public class Solution2Test extends TestCase {
    public void testSolution2() {
        char[][] nums = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Solution2 s = new Solution2();
        char[][] ret = s.solveSudoku(nums);

        for(int i = 0; i < ret.length; i++) {
            System.out.println(Arrays.toString(ret[i]));
        }
    }
}
