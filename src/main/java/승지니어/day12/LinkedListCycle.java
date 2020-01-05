package 승지니어.day12;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

/*
walker: 1번에 한칸씩
runner: 1번에 두칸씩 전진

사이클이 있으면 둘은 언제가 만남
사이클이 없으면 러너가 먼저 null에 도달

시간복잡도: O(n)
공간복잡도: O(1)
 */
public class LinkedListCycle {
   public boolean hasCycle(ListNode head) {
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
           return false;
       } else {
           return true;
       }
   }
}
