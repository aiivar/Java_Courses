package com.company;

import java.util.Scanner;

/**
 * Created by roi on 2/26/2019.
 */
public class Harder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("input: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("output: ");
        for (int i=n-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
