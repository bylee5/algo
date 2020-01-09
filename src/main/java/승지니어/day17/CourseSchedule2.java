package 승지니어.day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule2 {
    public int[] findOrder(int numCourses, int[][] p) {
        int[] indegree = new int[numCourses];
        int[] ret =new int[numCourses];
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        //edge[1]=>edge[0]
        //노드 연결
        for(int[] edge : p) {
            indegree[edge[0]]++;
            adjList.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
           if(indegree[i] == 0) q.offer(i);
        }
        int idx = 0;
        while(!q.isEmpty()) {
            int node = q.poll();
            ret[idx++] = node;
            for(int dest : adjList.get(node)) {
                if(--indegree[dest] == 0) q.offer(dest);
            }
            adjList.get(node).clear();
        }
        return idx == numCourses ? ret : new int[0];
    }
}
