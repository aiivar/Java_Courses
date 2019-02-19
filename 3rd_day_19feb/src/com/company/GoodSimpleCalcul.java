package com.company;

import java.util.Scanner;

/**
 * Created by roi on 2/19/2019.
 */
public class GoodSimpleCalcul {
    public static void main(String[] args) {
        double out = 0;
        System.out.println("insert the number: ");
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        System.out.println("insert operation(+,-,*,/): ");
        String op = sc.next();
        System.out.println("insert the next number: ");
        double a2 = sc.nextDouble();
        if (op.equals("+"))

        {
            out = a1 + a2;
        } else if (op.equals("-"))

        {
            out = a1 - a2;
        } else if (op.equals("*"))

        {
            out = a1 * a2;
        } else

        {
            out = a1 / a2;
        }
        System.out.println("result: " + out);


    }
}