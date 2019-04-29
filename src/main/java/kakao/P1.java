package kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class P1 {
    public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
        // Write your code here
        List<Integer> res = new ArrayList<Integer>();
        List<Integer> t = new ArrayList<Integer>();

        for(int i = 0; i < rotate.size(); i++){
            t.addAll(a);
            for(int j = 0; j < rotate.get(i); j++){
                Integer tmp = t.get(0);
                t.remove(0);
                t.add(tmp);
            }

            List<Integer> t1 = new ArrayList<Integer>();
            t1.addAll(t);
            HashSet<Integer> distinctData = new HashSet<Integer>(t1);
            t1 = new ArrayList<Integer>(distinctData);

            int max = Collections.max(t1);

            res.add(t.indexOf(max));
            t.clear();
            t1.clear();
        }

        return res;
    }
}