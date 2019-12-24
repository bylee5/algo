package book.algo.ch6;

import java.util.List;

public class ShortestPath {
    int n = 10; //도시의 수
    double[][] dist; //두 도시 간의 거리를 저장하는 배열
    //path: 지금까지 만든 경로
    //visited: 각 도시의 방문 여부
    //currentLength: 지금까지 만든 경로의 길이
    //나머지 도시들은 모두 방문하는 경로들 중 가장 짧은 것의 길이를 반환한다.
    double shortestpath(List<Integer> path, List<Boolean> visited, double currentLength) {
        //기저 사례: 모든 도시를 다 방문했을 때는 시작 도시로 돌아가고 종료한다.
        if(path.size() == n);

        return -1;
    }
}
