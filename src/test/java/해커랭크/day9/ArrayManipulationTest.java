package 해커랭크.day9;

import junit.framework.TestCase;

public class ArrayManipulationTest extends TestCase {
    public void testArrayManipulation() {
        int n = 10;
        int[][] queries = {
                {1, 5, 3},
                {4, 8, 7},
                {6, 9, 1}
        };

        ArrayManipulation a = new ArrayManipulation();
        System.out.println(a.arrayManipulation(n, queries));//10
    }

    public void testArrayManipulation1() {
        int n = 10;
        int[][] queries = {
                {2, 6, 8},
                {3, 5, 7},
                {1, 8, 1},
                {5, 9, 15}
        };

        ArrayManipulation a = new ArrayManipulation();
        System.out.println(a.arrayManipulation(n, queries));//31
    }

    public void testArrayManipulation2() {
        int n = 10;
        int[][] queries = {
                {1, 2, 100},
                {2, 5, 100},
                {3, 4, 100},
        };

        ArrayManipulation a = new ArrayManipulation();
        System.out.println(a.arrayManipulation(n, queries));//200
    }
    public void testArrayManipulation3() {
        int n = 10;
        int[][] queries = {
                {1, 5, 3},
                {4, 8, 7},
                {6, 9, 1},
        };

        ArrayManipulation a = new ArrayManipulation();
        System.out.println(a.arrayManipulation(n, queries));//10
    }
}