package 승지니어.day22;

import junit.framework.TestCase;

public class CopyListWithRandomPointerTest extends TestCase {
    public void testCopyListWithRandomPointer() {
        RandomListNode l1 = new RandomListNode(1);
        RandomListNode l2 = new RandomListNode(2);
        RandomListNode l3 = new RandomListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        l2.random = l1;
        l1.random = l3;
        l3.random = l2;

        CopyListWithRandomPointer rp = new CopyListWithRandomPointer();
        System.out.println(rp.copyRamdomList(l1).random.label);
    }
}
