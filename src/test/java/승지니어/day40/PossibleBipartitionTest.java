package 승지니어.day40;

import junit.framework.TestCase;

public class PossibleBipartitionTest extends TestCase {
    public void testPossibleBipartition() {
        int[][] dislikes = {{1,2},{1,3},{2,4}};
        int N = 4;

        PossibleBipartition p = new PossibleBipartition();
        System.out.println(p.possibleBipartition(N, dislikes));//true
    }

}