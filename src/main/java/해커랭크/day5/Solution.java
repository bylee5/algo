package 해커랭크.day5;

public class Solution {
    static int countingValleys(int n, String s){
        int res = 0;
        int step = 0;
        boolean v = false;

        for(int i = 0; i < n; i++){
            if('U' == s.charAt(i)){
                step++;
                if(v && step == 0) {
                    res++;
                    v = !v;
                }
            } else {
                if(step == 0){
                    v = !v;
                }
                step--;
            }
        }
        return res;
    }
}
