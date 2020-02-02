package 승지니어.day39;

import junit.framework.TestCase;

public class LRUCacheTest extends TestCase {
    public void testLRUCacheTest() {
        LRUCache cache = new LRUCache( 2 );

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // return 1
        cache.put(3, 3); //evicts key 2
        System.out.println(cache.get(2)); //returns -1 (not found)
        cache.put(4, 4); // evicts key 1
        System.out.println(cache.get(1)); // return -1
        System.out.println(cache.get(3));// return 3
        System.out.println(cache.get(4)); // return 4
    }
}
