package com.company;

import java.util.Scanner;

/**
 * Created by roi on 3/2/2019.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] num1 = {'4', '7', '1', '8', '6'};
        char[] num2 = {'6', '8', '3'};
        int c1=0,c2=0;
        int[] n1 =new int[num1.length];
        int[] n2 =new int[num2.length];
        for (int i = 0; i < num1.length ; i++) {
            char symbol = num1[i];
            int x = symbol - '0';
            n1[i]=x;
        }

        for (int i = 0; i < num2.length ; i++) {
            char symbol = num2[i];
            int x = symbol - '0';
            n2[i]=x;
        }

        for (int i = 0; i <n1.length ; i++) {
            c1=(int)(c1 + n1[i]*Math.pow(10, n1.length-i-1));
        }

        for (int i = 0; i <n2.length ; i++) {
            c2=(int)(c2 + n2[i]*Math.pow(10, n2.length-i-1));
        }

        System.out.println(c1+c2);
    }
}
