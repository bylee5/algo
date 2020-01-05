package 승지니어.day12;

import junit.framework.TestCase;

public class LinkedListCycleTest extends TestCase {
    public void testLinkedListCycle1() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);

        ln1.next = ln2;
        ln2.next = ln3;

        LinkedListCycle llc = new LinkedListCycle();
        System.out.println(llc.hasCycle(ln1));
    }

    public void testLinkedListCycle2() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);

        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln1;

        LinkedListCycle llc = new LinkedListCycle();
        System.out.println(llc.hasCycle(ln1));
    }
}
