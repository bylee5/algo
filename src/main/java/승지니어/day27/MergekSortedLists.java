package 승지니어.day27;

import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        ListNode ret = null;
        ListNode cur = null;

        //min heap
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length,
                /*comparator*/(a,b) -> a.val - b.val);

        for(ListNode node: lists) {
            if(node == null) continue;
            pq.offer(node);
        }

        while(!pq.isEmpty()) {
            ListNode node = pq.poll();
            if(node.next != null) pq.offer(node.next);
            if(ret == null) {
                ret = node;
                cur = node;
            } else {
                cur.next = node;
                cur = node;
            }
        }
        return ret;
    }
}
