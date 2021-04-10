package com.mfh.dsal.array;

public class ReverseArray {
    public static void main(String args[]) {
        int[] arrayData = new int[]{1, 2, 3, 4, 5};

        int temp;
        for (int i = 0; i < arrayData.length / 2; i++) {
            temp = arrayData[i];
            arrayData[i] = arrayData[arrayData.length - i - 1];
            arrayData[arrayData.length - i - 1] = temp;
        }

        // This will not work for primitive types
//        Integer[] arrayData = new Integer[]{1, 2, 3, 4, 5};
//        Collections.reverse(Arrays.asList(arrayData));

        System.out.println("New rotated array: ");
        for (int i = 0; i < arrayData.length; i++) {
            System.out.print(arrayData[i] + ", ");
        }

    }
}
