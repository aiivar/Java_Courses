package com.company;

import java.util.Scanner;

/**
 * Created by roi on 3/2/2019.
 */
public class FuncTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i]= sc.nextInt();
        }
        System.out.println(Function.arrSum(a));
    }
}
