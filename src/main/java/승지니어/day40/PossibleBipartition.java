package 승지니어.day40;

import java.util.ArrayList;
import java.util.List;

public class PossibleBipartition {
    // a-b -> a 그룹, b 그룹

    // a-b
    // |/
    // c
    public boolean possibleBipartition(int N, int[][] dislikes) {
        List<List<Integer>> adjList = new ArrayList<>();

        boolean[] visited = new boolean[N];
        boolean[] color = new boolean[N];

        for(int i = 0; i < N; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int[] d : dislikes) {
            int a = d[0]-1;
            int b = d[1]-1;
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        for(int i = 0; i < N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                boolean res = isBipartiteDFS(i, adjList, visited, color);
                if(!res) return false;
            }
        }
        return true;
    }

    private boolean isBipartiteDFS(int cur, List<List<Integer>> adjList, boolean[] visited, boolean[] color) {
        for(int next: adjList.get(cur)) {
            if(!visited[next]) {
                visited[next] = true;
                color[next] = !color[cur];
                boolean res = isBipartiteDFS(next, adjList, visited, color);
                if(!res) return false;
            } else if(color[cur] == color[next]){
               return false;
            }
        }
        return true;
    }
}
