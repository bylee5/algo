package 승지니어.day15;

import junit.framework.TestCase;

public class CourseScheduleTest extends TestCase {
    public void testCourseSchedule1() {
        int[][] input = {{1,0}};

        CourseSchedule cs = new CourseSchedule();
        System.out.println(cs.canFinish(2, input));
    }

    public void testCourseSchedule2() {
        int[][] input = {{1,0},{0,1}};

        CourseSchedule cs = new CourseSchedule();
        System.out.println(cs.canFinish(2, input));
    }

    public void testCourseSchedule3() {
        int[][] input = {{5,1},{5,3},{1,2},{1,4},{3,4},{4,0}};

        CourseSchedule cs = new CourseSchedule();
        System.out.println(cs.canFinish(6, input));
    }
}
