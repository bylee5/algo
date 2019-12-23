package 해커랭크.day3;

import java.util.Arrays;
import java.util.HashMap;

// Sherlock and the Valid String
public class Solution {
    static String isValid(String a){
        String res = "Yes";

        // 1.정렬
        char[] c = a.toCharArray();
        Arrays.sort(c);

        // 2. 갯수 세기
        HashMap<Character, Integer> hm = new HashMap();
        for (int i = 0; i < c.length; i++){
            int cnt =0;
            for(int j = 0; j < c.length; j++){
                if(c[i] == c[j]) {
                    cnt++;
                } else {
                    hm.put(c[i], cnt);
                    i = j;
                    j = j - 1;
                    cnt = 0;
                }
            }
            hm.put(c[i], cnt);
            break;
        }

        // 3. 갯수가 모두 일치하는지 확인

        int cnt = 0;
        int equal = 0;
        for(Object o : hm.keySet()){
            for(Object o1 : hm.keySet()){
                if(hm.get(o) == hm.get(o1)){
                    equal++;
                    continue;
                } else if (hm.get(o) > hm.get(o1)){
                    cnt = hm.get(o) - hm.get(o1);
                    if (cnt > 1) {
                        //System.out.println("No");
                        return res = "No";
                    }
                } else {
                    cnt = hm.get(o1) - hm.get(o);
                    if (cnt > 1) {
                        //System.out.println("No");
                        return res = "No";
                    }
                }
            }
        }

        // 3.1 아니면 1개 제거
        if(equal == 1) {
            return res = "Yes";
        } else if(hm.size() - equal > 1) return res = "No";


        // 4. 결과 확인
        return res;
    }
}
