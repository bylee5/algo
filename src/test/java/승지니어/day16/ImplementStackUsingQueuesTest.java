package 승지니어.day16;

import junit.framework.TestCase;

public class ImplementStackUsingQueuesTest extends TestCase {
    public void testImplementStackUsingQueues() {
        ImplementStackUsingQueues isuq = new ImplementStackUsingQueues();

        isuq.push(1);
        isuq.push(2);
        assertEquals(2, isuq.top());
        assertEquals(2, isuq.pop());
        assertEquals(1, isuq.pop());
        assertTrue(isuq.empty());
    }
}
