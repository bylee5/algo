package 승지니어.day13;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

/*
walker: 한번에 한칸씩
runner: 한번에 두칸씩 전진
xxxxx
  x x
  xxx

변수 사용
A: 시작노드부터 루프의 처음 노드까지 길이(2)
B: 루프 전체의 길이(8)
X: 루프의 처음노드부터 현재 노드까지 길이

만날 때까지 간 거리
walker: A+X
runner: A+n*B+X

2*walker = runner
2A+2Y = A+n*B+X
A와 X에 대해 오른쪽 식을 정리하면
A+X = n*B

X지점과 시작노드부터 두 워커를 전진시키면
루프의 처음노드에서 만나게 됨
 */
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
       ListNode walker = head;
       ListNode runner = head;

       while(runner != null) {
           runner = runner.next;
           if(runner != null) {
               runner = runner.next;
               walker = walker.next;
               if(runner == walker) {
                   break;
               }
           } else {
               break;
           }
       }
       if(runner == null) {
           return null;
       }

       ListNode check = head;
       while(check != walker) {
           check = check.next;
           walker = walker.next;
       }
       return check;
    }
}
