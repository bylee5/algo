package book.interviews.ch8;

import junit.framework.TestCase;

public class BinarySearchTest extends TestCase {
    public void testBinarySearch() {
        int[] array = {1,2,3,4};
        int target = 1;
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(array, target));//0: index?
    }

}