package 승지니어.day29;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervalsTest extends TestCase {
    public void testMergeIntervals() {
        Interval i1 = new Interval(1, 4);
        Interval i2 = new Interval(4, 5);

        List<Interval> list = new ArrayList<>();
        list.add(i1);
        list.add(i2);

        MergeIntervals m = new MergeIntervals();
        list = m.merge(list);
        for(Interval interval: list) {
            System.out.println(interval.start + ", " +interval.end);
        }
    }
}
