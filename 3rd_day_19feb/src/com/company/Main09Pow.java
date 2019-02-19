package com.company;

import java.util.Scanner;

/**
 * Created by roi on 2/19/2019.
 */
public class Main09Pow {
    public static double chPow(double x, double y) {
        Scanner sc=new Scanner(System.in);
        int res=1;
        for (int i=0;i<y;i++){
            res*=x;
        }
        return res;
    }
}
