package 승지니어.day16;

import junit.framework.TestCase;

public class MinStackTest extends TestCase {
    public void testMinStack() {
        MinStack ms = new MinStack();
        ms.push(1);
        ms.push(2);
        assertEquals(1, ms.getMin());
        ms.push(0);
        assertEquals(0, ms.getMin());
        ms.pop();
        assertEquals(1, ms.getMin());
    }
}
