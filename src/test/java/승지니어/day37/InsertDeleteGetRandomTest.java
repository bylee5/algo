package 승지니어.day37;

import junit.framework.TestCase;

public class InsertDeleteGetRandomTest extends TestCase {
    public void testInsertDeleteGetRandom() {
        InsertDeleteGetRandom i = new InsertDeleteGetRandom();

        System.out.println(i.insert(1));//true
        System.out.println(i.remove(2));//false
        System.out.println(i.insert(2));//true
        System.out.println(i.getRandom());//1, 2 중 하나

        System.out.println(i.remove(1));//true
        System.out.println(i.insert(2));//false
        System.out.println(i.getRandom());//2
    }
}
