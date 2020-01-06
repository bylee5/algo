package 승지니어.day14;

import junit.framework.TestCase;

public class ImplementQueueUsingStacksTest extends TestCase {
    public void testImplementQueueUsingStacks() {
        ImplementQueueUsingStacks iqus = new ImplementQueueUsingStacks();

        iqus.push(1);
        iqus.push(2);
        iqus.push(3);

        System.out.println(iqus.peek());//1
        System.out.println(iqus.pop());//1
        System.out.println(iqus.peek());//2
    }
}
