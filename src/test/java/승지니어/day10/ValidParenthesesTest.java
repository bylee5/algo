package 승지니어.day10;

import junit.framework.TestCase;

public class ValidParenthesesTest extends TestCase {
    public void testValidParentheses1() {
        String s = "()";
        ValidParentheses vp = new ValidParentheses();

        System.out.println(vp.isValid(s));
    }

    public void testValidParentheses2() {
        String s = "(){}";
        ValidParentheses vp = new ValidParentheses();

        assertEquals(true, vp.isValid(s));
    }

    public void testValidParentheses3() {
        String s = "(()";
        ValidParentheses vp = new ValidParentheses();

        assertFalse(vp.isValid(s));
    }
}
