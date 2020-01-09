package 승지니어.day17;

import junit.framework.TestCase;

import java.util.Arrays;

public class CourseSchedule2Test extends TestCase {
    public void testCourseSchedule2() {
        int[][] courses = {
                {1,0},
                {2,0},
                {3,1},
                {3,2}
        };
        int numCourse = courses.length;

        CourseSchedule2 cs2 = new CourseSchedule2();
        System.out.println(Arrays.toString(cs2.findOrder(numCourse, courses)));
    }
}
