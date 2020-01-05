package 승지니어.day13;

import junit.framework.TestCase;

public class LinkedListCycle2Test extends TestCase {
    public void testLinkedListCycle2() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);

        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln1;

        LinkedListCycle2 llc2 = new LinkedListCycle2();
        System.out.println(llc2.detectCycle(ln1).val);
    }
}
