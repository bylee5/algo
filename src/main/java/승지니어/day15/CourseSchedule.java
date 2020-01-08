package 승지니어.day15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CourseSchedule {
    /*
    1. indegree == 0인 것들 탐색
    2. 관련 edge 제거, indegree 갱신
    1., 2.를 반복
    루프 종료 후, 모든 노드 탬색했는지 확인
     */
    public boolean canFinish(int numCourses, int[][] p) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        //edge[1]=>edge[0]
        for(int[] edge: p) {
            indegree[edge[0]]++;
            adjList.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0) q.offer(i);
        }
        Set<Integer> visited = new HashSet<>();
        while(!q.isEmpty()) {
            int node = q.poll();
            visited.add(node);
            for(int dest: adjList.get(node)) {
                if(--indegree[dest] == 0) q.offer(dest);
            }
            adjList.get(node).clear();
        }
        return visited.size() == numCourses;
    }
}
