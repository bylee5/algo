package kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class P2 {
    /*
     * Complete the 'reassignedPriorities' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY issuePriorities as parameter.
     */

    public static List<Integer> reassignedPriorities(List<Integer> issuePriorities) {
        // Write your code here
        List<Integer> res = new ArrayList<Integer>();
        List<Integer> t = new ArrayList<Integer>();
        t.addAll(issuePriorities);

        HashSet<Integer> distinctData = new HashSet<Integer>(issuePriorities);
        issuePriorities = new ArrayList<Integer>(distinctData);

        Collections.sort(issuePriorities);

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int j = 0; j < issuePriorities.size(); j++){
            hm.put(issuePriorities.get(j), j+1);
        }

        for(int j = 0; j < t.size(); j++){
            res.add(hm.get(t.get(j)));
        }

        return res;
    }

}
