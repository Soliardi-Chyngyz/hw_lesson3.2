package com.company;

import java.util.Arrays;

public class Main {
    static void printArr(int[] array) {
        Arrays.stream(array).forEach((el) -> System.out.print(el + " "));
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {-3,5,1,-9,-2,0,1,8,-5,4};

        int minValueIndex = 0;
        for (int j = 0; j < arr.length; j++) {
            int min = Integer.MAX_VALUE;

            for (int i = j; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minValueIndex = i;
                }
            }

            int temp = arr[j];
            arr[j] = arr[minValueIndex];
            arr[minValueIndex] = temp;

            printArr(arr);
        }
    }
}
