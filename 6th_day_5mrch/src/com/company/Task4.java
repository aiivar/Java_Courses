package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by roi on 3/5/2019.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[n];
        int maxi=0;
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextLine();
        }
        for (int i = 0; i <n ; i++) {
            char[] s = arr[i].toCharArray();
            count[i]=s.length;
        }
        for (int i = 0; i <n-1 ; i++) {
            maxi=0;
            for (int j = 0; j <n-i ; j++) {
                if(count[j]>count[maxi]){
                    maxi=j;
                }
            }
            String temp= arr[maxi];
            arr[maxi]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
