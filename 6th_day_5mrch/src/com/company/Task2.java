package com.company;

import java.util.Arrays;

/**
 * Created by roi on 3/5/2019.
 */
public class Task2 {
    public static void main(String[] args) {
        int temp;
        int maxi=0;
        int max = 0;
        int[] arr = {3,7,1,5,8};
        for (int j = 0; j <arr.length-1 ; j++) {
            maxi=0;
            for (int i = 0; i < arr.length-j ; i++) {
                if (arr[i]>arr[maxi]){
                    maxi=i;
                }
            }
            temp=arr[maxi];
            arr[maxi]=arr[arr.length-1-j];
            arr[arr.length-1-j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
