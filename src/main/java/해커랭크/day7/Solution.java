package 해커랭크.day7;

public class Solution {
    static long repeatedString(String s, long n) {
        long ac = 0;// a의 수
        long repeat = 0;// 반복 수
        long xr = 0;// 나머지
        long c = 0;// 나머지 수

        for(int i = 0; i < s.length(); i++) {
            if('a' == s.charAt(i)) {
                ac++;
            }
        }

        repeat = n / s.length();

        xr = n % s.length();
        for(int i = 0; i < xr; i++) {
            if('a' == s.charAt(i)) {
                c++;
            }
        }

        return (ac * repeat) + c;
    }
}
