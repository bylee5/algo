package day2;

import java.io.*;


public class Solution {

    static int hourglassSum(int[][] arr) {
        int total = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length - 2; i++) {
            for(int j = 0; j < arr[i].length -2; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] +arr[i+2][j+1] + arr[i+2][j+2];
                if (sum > total) total = sum;
            }
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
//        String[] s = {"1 1 1 0 0 0",
//                        "0 1 0 0 0 0",
//                        "1 1 1 0 0 0",
//                        "0 0 2 4 4 0",
//                        "0 0 0 2 0 0",
//                        "0 0 1 2 4 0"};
        String[] s = {"-1 -1 0 -9 -2 -2",
                "-2 -1 -6 -8 -2 -5",
                "-1 -1 -1 -2 -3 -4",
                "-1 -9 -2 -4 -4 -5",
                "-7 -3 -3 -2 -9 -9",
                "-1 -3 -1 -2 -4 -5"};
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = s[i].split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println(result);


    }
}
