package book.interviews.ch8;

import junit.framework.TestCase;

public class PermutationsP245Test extends TestCase {
    public void testPermutations() {
        final String str = "abcd";

        PermutationsP245 p = new PermutationsP245(str);
        p.permute();
        System.out.println(p.toString());
    }
}