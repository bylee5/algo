package 승지니어.day26;

import junit.framework.TestCase;

public class MergeTwoSortedListsTest extends TestCase {
    public void testMergeTwoSoredLists() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln4 = new ListNode(4);

        ln1.next = ln2;
        ln2.next = ln4;
        ln4.next = null;

        ListNode l1 = new ListNode(1);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next = l3;
        l3.next = l4;
        l4.next = null;

        MergeTwoSortedLists m = new MergeTwoSortedLists();
        ListNode ret = m.mergeTwoLists(ln1, l1);

        for(int i = 0; i < 6; i++) {
            System.out.println(ret.val);
            ret = ret.next;
        }

    }
}
