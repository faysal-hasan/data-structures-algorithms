package com.mfh.dsal.array;

import java.util.Scanner;

public class PlusMinusSolution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        double plusCount = 0;
        double minusCount = 0;
        double zeroCount = 0;
        for (int value : arr) {
            if (value < 0) {
                minusCount++;
            } else if (value > 0) {
                plusCount++;
            } else {
                zeroCount++;
            }
        }

        double plusResult = plusCount / arr.length;
        double minusResult = minusCount / arr.length;
        double zeroResult = zeroCount / arr.length;

        System.out.println(String.format("%.6f", plusResult));
        System.out.println(String.format("%.6f", minusResult));
        System.out.println(String.format("%.6f", zeroResult));

    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
