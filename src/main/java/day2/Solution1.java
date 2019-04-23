package day2;

import java.io.IOException;
import java.util.Scanner;

public class Solution1 {

    static int[] hourglassSum(int[] arr, int b) {

        for(int j = 0; j < b; j++) {
            int tmp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length - 1] = tmp;

            for(int r : arr) {
                System.out.print(r + " ");//5 1 2 3 4
            }
            System.out.println();
        }
        return arr;
    }


    public static void main(String[] args) throws IOException {
        String s = "1 2 3 4 5";

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            String[] arrRowItems = s.split(" ");

                int arrItem = Integer.parseInt(arrRowItems[i]);
                arr[i] = arrItem;
        }

        int result[] = hourglassSum(arr, 4);

        for(int i : result) {
            //System.out.print(i + " ");//5 1 2 3 4
        }


    }
}
