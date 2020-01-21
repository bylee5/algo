package 승지니어.day27;

import junit.framework.TestCase;

public class MergekSortedListsTest extends TestCase {
    public void testMergekSortedLists() {
        ListNode ln1 = new ListNode(1);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);

        ln1.next = ln4;
        ln4.next = ln5;
        ln5.next = null;

        ListNode n1 = new ListNode(1);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n3;
        n3.next = n4;
        n4.next = null;

        ListNode e2 = new ListNode(2);
        ListNode e6 = new ListNode(6);

        e2.next = e6;
        e6.next = null;

        ListNode[] lns = {ln1, n1, e2};

        MergekSortedLists m = new MergekSortedLists();
        ListNode ret = m.mergeKLists(lns);
        while(ret != null) {
            System.out.println(ret.val);
            if(ret.next != null) {
                ret = ret.next;
            } else {
                ret = null;
            }
        }
    }
}
