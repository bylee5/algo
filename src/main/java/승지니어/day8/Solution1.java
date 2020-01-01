package 승지니어.day8;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public List<String> letterCasePermutation(String s) {
        char[] arr = s.toCharArray();
        List<String> ret = new ArrayList<>();
        backtrack(arr, ret, 0);
        return ret;
    }
    public void backtrack(char[] arr, List<String> ret, int idx) {
        if(idx == arr.length) {
            ret.add(new String(arr));
        } else {
            char c = arr[idx];
            if(isAlpha(c)) {
                arr[idx] = Character.toLowerCase(c);
                backtrack(arr, ret, idx+1);
                arr[idx] = Character.toUpperCase(c);
                backtrack(arr, ret, idx+1);
            } else {
                backtrack(arr, ret, idx+1);
            }
        }
    }
    public boolean isAlpha(char c) {
       return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
