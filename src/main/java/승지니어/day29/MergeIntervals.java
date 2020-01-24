package 승지니어.day29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
       if(intervals == null || intervals.size() <= 1) return intervals;

       List<Interval> ret = new ArrayList<>();

       Collections.sort(intervals, (a, b) -> a.start - b.start);

       for(int i = 1; i < intervals.size(); i++) {
           Interval a = intervals.get(i-1);
           Interval b = intervals.get(i);
           if(a.end >= b.start && b.end >= a.start) {
               b.start = Math.min(a.start, b.start);
               b.end = Math.max(a.end, b.end);
           } else {
               ret.add(a);
           }
       }
       //for문에서 마지막 원소를 참조하지 못하기 때문에 여기서 처리
       ret.add(intervals.get(intervals.size()-1));

       return ret;
    }
}
