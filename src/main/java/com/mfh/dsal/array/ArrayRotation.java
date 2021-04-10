package com.mfh.dsal.array;

import java.util.Scanner;

public class ArrayRotation {


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int arraySize = scanner.nextInt();

        int arrayStorage[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayStorage[i] = scanner.nextInt();
        }

        System.out.println("Enter the rotation of array:");
        int rotation = scanner.nextInt();


        for (int i = 0; i < arraySize; i++) {
            int temp = arrayStorage[i];

            int rotatedIndex = i + rotation;
            arrayStorage[i] = arrayStorage[rotatedIndex];

//            if (rotatedIndex + 1 < arraySize) {
//                arrayStorage[rotatedIndex + 1] = temp;
//            }
        }

        System.out.println("New rotated array: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(arrayStorage[i] + ", ");
        }
    }
}
