package 승지니어.day32;

import junit.framework.TestCase;

public class EditDistanceTest extends TestCase {
    public void testEditDistance() {
        String word1 = "horse";
        String word2 = "ros";

        EditDistance e = new EditDistance();
        System.out.println(e.minDistance(word1, word2));
    }
}
