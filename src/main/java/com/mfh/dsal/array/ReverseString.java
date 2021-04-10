package com.mfh.dsal.array;

public class ReverseString {
    public static void main(String... args) {
        String dataToReverse = "Hasan";
        StringBuilder stringBuilder = new StringBuilder(dataToReverse);
        StringBuilder reverseString = stringBuilder.reverse();
        System.out.println(reverseString);
    }
}
