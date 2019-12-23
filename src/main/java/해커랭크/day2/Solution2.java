package 해커랭크.day2;

import java.io.IOException;

public class Solution2 {

    static int makeAnagram(String a, String b) {
        int delCnt = 0;
        String tmp = new String(a);

        for (int i = 0; i < b.length(); i++) {
            if(a.contains(b.charAt(i) + "")) {
                a = a.substring(0, a.indexOf(b.charAt(i))) + a.substring(a.indexOf(b.charAt(i)) + 1, a.length());
            } else {
                delCnt++;
            }
        }
        a = tmp;
        for (int i = 0; i < a.length(); i++) {
            if(b.contains(a.charAt(i) + "")) {
                b = b.substring(0, b.indexOf(a.charAt(i))) + b.substring(b.indexOf(a.charAt(i)) + 1, b.length());
            } else {
                delCnt++;
            }
        }
        return delCnt;
    }
    public static void main(String[] args) throws IOException {
        String a = "cde";
        String b = "abc";

        int res = makeAnagram(a, b);

    }
}
