package 승지니어.day6;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Solution2 {
    // 워커 러너 테크닉
    // walker : 한번에 한칸씩
    // runner : 한버네 두칸씩
    // runner가 끝나면 walker는 중간에 와있음
    // 구현을 위한 브레인 스토밍
    // 1
    // walker: 1x 2 -> 1 2x
    // runner: 1x 2 -> 1 2 nullx
    // 2
    // walker: 1x 2 3 -> 1 2x 3 -> 1 2x 3
    // runner: 1x 2 3 -> 1 2x 3 -> 1 2 3 nullx
    public ListNode middleNode(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;

        // walker는 한칸씩, runner는 두칸씩
        while (runner != null) {
            runner = runner.next;//runner 한칸 전진
            if(runner != null) {
                walker = walker.next;// walker 한칸 전진
                runner = runner.next;// runner 다시 한칸 전진(총 2칸 전진)
            }
        }
        return walker;
    }
}
