package 해커랭크.day10;

import junit.framework.TestCase;

public class CombinationsTest extends TestCase {
    public void testCombinations() {
        final String str = "wxyz";
        Combinations c = new Combinations(str);
        c.combine();
        System.out.println(c.toString());
    }
}