package 승지니어.day41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TheSkylineProblem {
    public class  Point {
        int x;
        int height;
        boolean start;
        public Point(int x, int height, boolean start) {
            this.x = x;
            this.height = height;
            this.start = start;
        }
    }
    public List<int[]> getSkyline(int[][] buildings) {
        List<Point> list = new ArrayList<>();
        for(int[] b : buildings) {
           list.add(new Point(b[0], b[2], true));
           list.add(new Point(b[1], b[2], false));
        }
        Collections.sort(list, (a, b) -> {
            if(a.x != b.x) {
                return a.x - b.x;
            } else if(a.start && !b.start) {
                return -1;
            } else if(!a.start && b.start) {
                return 1;
            } else if(a.start && b.start) {
                return b.height - a.height;
            } else /* !a.start && !b.start */{
                return a.height - b.height;
            }
        });
        PriorityQueue<Integer> pq = new PriorityQueue<>(5, (a,b) -> b-a);
        pq.offer(0);

        List<int[]> ret = new ArrayList<>();
        for(Point p : list) {
            int max = pq.peek();
            if(p.start) {
                //add to pq
                pq.offer(p.height);
            } else {
                //remove from pq
                pq.remove(p.height);
            }
            if(pq.peek() != max) {
                ret.add(new int[]{p.x, pq.peek()});
            }
        }
        return ret;
    }
}
