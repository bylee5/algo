package 승지니어.day25;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    // 우선순위 큐: offer, poll, peek 함수
    // 자바 같은 경우: natural ordering, integer 같은 경우는 오름차순 정렬이 기본
    // offer: 3 2 1 5 4-> poll: 1 2 3 4 5, 시간 복잡도 offer/poll O(log n)

    //문제풀이전략
    //큐에는 k개의 원소를 보관
    //지금까지 본 원소중 가장 큰 k개
    //큐의 맨 앞에는 k개중 가장 작은 원소가 있다.
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public int findKthLargest(int[] nums, int k) {
        for(int num : nums) {
            if(pq.size() < k) {
                pq.offer(num);
            } else {
                if(num > pq.peek()) {
                    pq.poll();
                    pq.offer(num);
                }
            }
        }
        return pq.peek();
    }
}
