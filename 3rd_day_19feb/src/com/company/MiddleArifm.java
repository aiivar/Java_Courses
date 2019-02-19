package com.company;

import java.util.Scanner;

/**
 * Created by roi on 2/19/2019.
 */
public class MiddleArifm {
    public static void main(String[] args) {
        System.out.println("insert amount");
        Scanner sc = new Scanner(System.in);
        double a, sum = 0;
        int b;
        System.out.println("insert your numbers");
        a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            b = sc.nextInt();
            sum += b;
        }
        System.out.println(sum / a);
    }
}
