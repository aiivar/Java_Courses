package com.company;

import java.util.Scanner;

/**
 * Created by roi on 2/26/2019.
 */
public class Maxarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0,maxi=0;
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("input: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i<n;i++){
            if(max<a[i]){
                max=a[i];
                maxi=i;
            }
        }
        System.out.println("max: "+max+". "+"index of max: "+maxi);
    }
}
