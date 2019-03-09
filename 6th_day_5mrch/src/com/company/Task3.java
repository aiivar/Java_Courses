package com.company;

import java.util.Arrays;

/**
 * Created by roi on 3/5/2019.
 */
public class Task3 {
    public static void main(String[] args) {
        int temp;
        int mini = 0;
        int max = 0;
        int[] arr = {3, 7, 1, 5, 8};
        for (int j = 0; j < arr.length - 1; j++) {
            mini = 0;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] < arr[mini]) {
                    mini = i;
                }
            }
            temp = arr[mini];
            arr[mini] = arr[arr.length - 1 - j];
            arr[arr.length - 1 - j] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
