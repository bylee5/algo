package 해커랭크.day8;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    static void minimumBribes(int[] q) {
        String tooChaotic = "Too chaotic";
        if(1 > q.length && q.length > 10) {
            System.out.println(tooChaotic);
        }
        List<Integer> queue = new LinkedList();
        int min = 0;
        //큐 초기화
        for(int i = 1; i <= q.length; ++i) {
            queue.add(i);
        }

        int mv;
        for(int i = q.length; i > 0; --i) {
            mv = 0;
            for(int j = queue.size() - 1; j > 0; --j) {
                if(q[j] != queue.get(j)) {
                    mv++;
                    if(mv > 2) break;
                    if(queue.get(j) < q[j]) break;
                    int tmp = queue.get(j);
                    queue.remove(j);
                    queue.add(j - 1, tmp);
                    min++;
                }
            }
        }
        boolean ok = true;
        for(int i = 0; i < q.length; ++i) {
            if(q[i] != queue.get(i)) {
                ok = false;
            }
        }
        if(ok) {
            System.out.println(min);
        } else {
            System.out.println(tooChaotic);
        }

    }

    public static void main(String arg[]) {
        int[] q = {2, 1, 5, 3, 4};
        minimumBribes(q);
        int[] q1 = {2, 5, 1, 3, 4};
        minimumBribes(q1);
        int[] q3 = {1,2,5,3,4,7,8,6};
        minimumBribes(q3);
    }
}
