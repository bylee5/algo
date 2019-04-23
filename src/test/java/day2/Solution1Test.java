package day2;

import junit.framework.TestCase;
import org.junit.Test;

public class Solution1Test extends TestCase {
    @Test
    public void testSolution() throws Exception {
        String s = "1 2 3 4 5";

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            String[] arrRowItems = s.split(" ");

            int arrItem = Integer.parseInt(arrRowItems[i]);
            arr[i] = arrItem;
        }

        int res[] = Solution1.hourglassSum(arr, 4);

        int[] solution = {5, 1, 2, 3, 4};
        for(int i = 0; i < solution.length; i++) {
            //System.out.print(i + " ");//5 1 2 3 4
            assertEquals(solution[i], res[i]);

        }
    }
}
